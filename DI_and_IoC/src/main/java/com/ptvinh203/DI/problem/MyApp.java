package com.ptvinh203.DI.problem;

public class MyApp {
    private final EmailService email = new EmailService();

    public void processMessages(String msg, String receiver) {
        this.email.sendEmail(msg, receiver);
    }
}
