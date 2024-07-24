package com.ptvinh203.DI.solution;

public class EmailServiceImpl implements MessageService {
    public void sendMessage(String msg, String receiver) {
        System.out.println("Email sent to " + receiver + " with Message=" + msg);
    }
}
