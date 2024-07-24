package com.ptvinh203.DI.solution;

public class Main {
    public static void main(String[] args) {
        String msg = "Hello";
        String email = "vinh@gmail.com";
        String phone = "0123456789";
        MessageServiceInjector injector = null;
        MyApp app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getMyApp();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getMyApp();
        app.processMessages(msg, phone);
    }
}
