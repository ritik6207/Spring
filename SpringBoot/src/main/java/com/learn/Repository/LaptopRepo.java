package com.learn.Repository;

import com.learn.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop lap){
        System.out.println("Save in Database...");
    }
}
