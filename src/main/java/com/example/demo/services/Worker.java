package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Worker {

    @Autowired
    Manager manager;

    private String myWork = null;

    public void startWork(String work) {
        System.out.println("I'm starting to do " + work);
        myWork = work;
    }

    public void askManagerForDetails() {
        if(myWork == null) {
            System.out.println("No work right now - no need to ask details.");
        }

        String managerPhrase = manager.askForDetails(myWork);
        System.out.println("Manager said to me: '" + managerPhrase + "'");
    }
}
