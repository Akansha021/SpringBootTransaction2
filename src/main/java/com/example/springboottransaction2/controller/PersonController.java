package com.example.springboottransaction2.controller;

import com.example.springboottransaction2.dto.PersonDto;
import com.example.springboottransaction2.dto.ProductDto;
import com.example.springboottransaction2.entity.Product;
import com.example.springboottransaction2.services.DemoService;
import com.example.springboottransaction2.services.MyServices;
import com.example.springboottransaction2.services.PersonServices;
import com.example.springboottransaction2.servicesimpl.PersonServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class PersonController {
    //@Autowired
    PersonServices personServices;

    @Autowired
    MyServices myServices;
    @Autowired
    DemoService demoService;
    Logger logger= LoggerFactory.getLogger(PersonController.class);

    @GetMapping("/view")
    public PersonDto viewPersonInfo(@RequestBody PersonDto personDto){
        return personServices.viewPersonInfo(personDto);
    }

    @GetMapping("/myView")
    public String getMyView(@RequestAttribute String auth){
        System.out.println("Controller: "+auth);
        logger.info("{PersonController} + Inside getMyView method ");
        return personServices.getMyView();
    }

    @PostMapping("/myProduct")
    public Product getProductDto(@RequestBody ProductDto productDto){

        return myServices.myService(productDto);

    }

    @GetMapping("/myOs")
    public String getOS(){
        int a=37;
        System.out.println(a);
        logger.info("{PersonController} + Inside getMyOS method ");
        return myServices.display();

    }

    @Scheduled(fixedRate = 5000)
    public void sch(){
        System.out.println("Scheduler");
    }

    @GetMapping("/demserv")
    public void myDemo(){
        System.out.println("Controller");
        demoService.myDemo();
    }
}
