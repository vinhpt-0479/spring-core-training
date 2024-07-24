package com.ptvinh203.DI.solution;

public class SMSServiceImpl implements MessageService {
    public void sendMessage(String msg, String receiver) {
        System.out.println("SMS sent to " + receiver + " with Message=" + msg);
    }
}