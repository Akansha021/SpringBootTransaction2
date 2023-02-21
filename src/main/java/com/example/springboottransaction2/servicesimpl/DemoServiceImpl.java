package com.example.springboottransaction2.servicesimpl;

import com.example.springboottransaction2.services.DemoService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Scheduled(fixedRate = 5000)        //Scheduling
    @Override
    public void myDemo() {
        //System.out.println("Service");
        //System.out.println("Demo");
        System.out.println("My Demo Statement");
    }

    @Scheduled(fixedRate = 5000)        //Scheduling
    public void myDemo1() {
        //System.out.println("Service");
        //System.out.println("Demo");
        System.out.println("My Demo Statement1");
    }


}
