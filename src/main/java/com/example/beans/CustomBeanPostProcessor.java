package com.example.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Custom BeanPostProcessor example
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

    private final Logger logger = LoggerFactory.getLogger(CustomBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("exampleBeanOne".equals(beanName) || "exampleBeanTwo".equals(beanName) || "exampleBeanThree".equals(beanName)) {
            logger.info("BeanPostProcessor: Before Initialization of bean {}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("exampleBeanOne".equals(beanName) || "exampleBeanTwo".equals(beanName) || "exampleBeanThree".equals(beanName)) {
            logger.info("BeanPostProcessor: After Initialization of bean {}", beanName);
        }
        return bean;
    }
}

