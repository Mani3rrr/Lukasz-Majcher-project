package com.kodilla.patterns2.facade.api;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher2.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processorOrder(..))")
    public void logBefore() {
        LOGGER.info("ProcessorOrder is in use");
    }

    @Around("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processorOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            result = proceedingJoinPoint.proceed();
            LOGGER.info("ProcessorOrder is done");
        } catch (Throwable throwable) {
            LOGGER.error("ProcessorOrder throws an error " + throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}

