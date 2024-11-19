package org.learn.app.config;

import org.learn.app.Alien;
import org.learn.app.Computer;
import org.learn.app.Desktop;
import org.learn.app.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.learn.app")
public class AppConfig {



//    @Bean
//    public Alien alien( Computer com){ //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(23);
//        obj.setCom(com);
//        return obj;
//    }
//
////    @Bean(name = {"com1","beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
