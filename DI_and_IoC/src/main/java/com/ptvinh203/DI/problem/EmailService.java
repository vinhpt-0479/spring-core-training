package com.ptvinh203.DI.problem;

public class EmailService {
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sent to " + receiver + "with Message=" + message);
    }
}
