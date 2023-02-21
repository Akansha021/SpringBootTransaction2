package com.example.springboottransaction2.servicesimpl;

import com.example.springboottransaction2.services.CarService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Scheduled(fixedRate = 5000)        //Scheduling
    @Override
    public void myCar() {
        System.out.println("Car Service");
    }
}
