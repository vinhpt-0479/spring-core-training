package spring.core.nvd.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void performOperation() {
        System.out.println("Performing operation...");
    }

    public void anotherOperation() {
        System.out.println("Performing another operation...");
    }
}
