package com.example.demobean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Scope("prototype")
    public MyPrototypeBean myPrototypeBean() {
        return new MyPrototypeBean();
    }

    @Bean
    @Scope("singleton")
    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }
}

class MySingletonBean {
    public MySingletonBean() {
        System.out.println("MySingletonBean instance created");
    }
}

class MyPrototypeBean {
    public MyPrototypeBean() {
        System.out.println("MyPrototypeBean instance created");
    }
}
