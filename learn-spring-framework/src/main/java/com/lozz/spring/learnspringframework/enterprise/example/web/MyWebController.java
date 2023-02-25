package com.lozz.spring.learnspringframework.enterprise.example.web;

import com.lozz.spring.learnspringframework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {

    private final BusinessService businessService;

    // Constructor Injection (Recommended)
    @Autowired
    public MyWebController(BusinessService businessService) {
        System.out.println("Constructor Injection");
        this.businessService = businessService;
    }

//    // Field type Injection (Reflection)
//    @Autowired
//    private BusinessService businessService;

    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}


