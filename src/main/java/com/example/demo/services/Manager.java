package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Manager {

    @Autowired
    Worker worker;

    public void doWork(String work) {
        worker.startWork(work);
    }

    public String askForDetails(String details) {
        return "Yes, do " + details;
    }
}
