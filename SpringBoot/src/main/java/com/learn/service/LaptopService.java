package com.learn.service;

import com.learn.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap) {
        System.out.println("Service method called");
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
