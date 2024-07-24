package com.ptvinh203.DI.solution;

public class SMSServiceInjector implements MessageServiceInjector {
    public MyApp getMyApp() {
        return new MyApp(new SMSServiceImpl());
    }
}
