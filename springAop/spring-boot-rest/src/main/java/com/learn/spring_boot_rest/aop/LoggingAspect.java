package com.learn.spring_boot_rest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


//    return type, class-name.method-name(agrs)
    @Before("execution(* com.learn.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.learn.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method call  " + jp.getSignature().getName());
    }

    @After("execution(* com.learn.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.learn.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCallExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.learn.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.learn.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method has some issue " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.learn.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.learn.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCallExecutedSuccessfully(JoinPoint jp){
        LOGGER.info("Method Executed successfully " + jp.getSignature().getName());
    }
}
