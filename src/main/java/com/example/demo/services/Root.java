package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Root {
    @Autowired
    Manager manager;

    @Autowired
    Worker worker;

    public void mainProcess(){
        worker.askManagerForDetails();

        manager.doWork("Bring me the 400 rubles");

        worker.askManagerForDetails();
    }
}
