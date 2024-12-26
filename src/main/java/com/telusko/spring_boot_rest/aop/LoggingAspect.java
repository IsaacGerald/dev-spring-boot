package com.telusko.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


    /**
     * Before Advice
     * return type, class name, method name, args
     * e.g return type class-name.method-name(args)
     */
    @Before("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.telusko.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called  " + jp.getSignature().getName());
    }

}
