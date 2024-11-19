package org.learn.app.config;

import org.learn.app.Alien;
import org.learn.app.Computer;
import org.learn.app.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(23);
        obj.setCom(com);
        return obj;
    }

//    @Bean(name = {"com1","beast"})
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
