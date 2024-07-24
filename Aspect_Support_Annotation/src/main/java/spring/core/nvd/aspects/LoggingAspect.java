package spring.core.nvd.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* transfer(..))")
    private void anyOldTransfer() {}
    @Pointcut("execution(public * *(..))")
    private void anyPublicFunction() {}
    @Pointcut("execution(Operation. *(..))")
    private void anyPublicOperation() {}
    @Pointcut("within(spring.core.nvd.trading..*)")
    private void inTrading() {}
    @Pointcut("anyPublicOperation() && inTrading()")
    private void tradingOperation() {}
    @Pointcut("execution(public * spring.core.services.MyService.*(..))")
    private void anyServices(){}

    @Before("anyServices()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }
    @After("anyServices()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }
}
