package com.example.springboottransaction2.entity;

import com.example.springboottransaction2.services.CarService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Hello implements CarService {
    @Scheduled(fixedRate = 5000)        //Scheduling
    public void hello(){
        System.out.println("Hello");
    }

    @Scheduled(fixedRate = 5000)        //Scheduling
    @Override
    public void myCar() {
        System.out.println("MyCar1");
    }
}
