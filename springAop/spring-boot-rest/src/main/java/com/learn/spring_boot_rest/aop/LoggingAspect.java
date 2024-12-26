package com.learn.spring_boot_rest.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


//    return type, class-name.method-name(agrs)
    @Before("execution(* com.learn.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(){
        LOGGER.info("Log Method call");
    }
}
