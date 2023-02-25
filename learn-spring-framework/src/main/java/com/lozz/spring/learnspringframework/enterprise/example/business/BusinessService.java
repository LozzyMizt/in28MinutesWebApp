package com.lozz.spring.learnspringframework.enterprise.example.business;

import com.lozz.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

//    // Constructor Injection
//    @Autowired
//    public BusinessService(DataService dataService) {
//        System.out.println("Constructor Injection");
//        this.dataService = dataService;
//    }

    // Field type Injection (Reflection)
    @Autowired
    private DataService dataService;

//    // Setter Injection
//    @Autowired
//    public void setDataService(DataService dataService) {
//        System.out.println("Setter Injection");
//        this.dataService = dataService;
//    }

    public  long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
