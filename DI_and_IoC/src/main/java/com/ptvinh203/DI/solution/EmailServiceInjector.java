package com.ptvinh203.DI.solution;

public class EmailServiceInjector implements MessageServiceInjector {
    public MyApp getMyApp() {
        return new MyApp(new EmailServiceImpl());
    }
}
