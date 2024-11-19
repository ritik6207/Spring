package com.learn;

import com.learn.model.Alien;
import com.learn.model.Laptop;
import com.learn.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}

}
