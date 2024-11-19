package org.learn.app.config;

import org.learn.app.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Bean(name = {"com2","desktop1","beast"})
    @Bean(name = "beast")
    public Desktop desktop(){
        return new Desktop();
    }
}
