package spring.core.nvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.nvd.services.MyService;

@SpringBootApplication
public class NvdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NvdApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        MyService myService = context.getBean(MyService.class);
        
        myService.performOperation();
        myService.anotherOperation();
	
	}
}
