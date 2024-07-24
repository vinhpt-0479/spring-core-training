package com.ptvinh203.DI.solution;

public class MyApp {
    private MessageService service;

    public MyApp(MessageService svc) {
        this.service = svc;
    }

    public void processMessages(String msg, String receiver) {
        this.service.sendMessage(msg, receiver);
    }
}
