package com.example.demobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    @Autowired
    private MySingletonBean mySingletonBean;

    @Autowired
    private MyPrototypeBean myPrototypeBean;

    public void init() {
        System.out.println("Singleton Bean: " + mySingletonBean);
        System.out.println("Prototype Bean: " + myPrototypeBean);

        // Fetching prototype bean multiple times to demonstrate scope
        MyPrototypeBean prototypeBean1 = myPrototypeBean;
        MyPrototypeBean prototypeBean2 = myPrototypeBean;
        System.out.println("Prototype Bean 1: " + prototypeBean1);
        System.out.println("Prototype Bean 2: " + prototypeBean2);
    }
}
