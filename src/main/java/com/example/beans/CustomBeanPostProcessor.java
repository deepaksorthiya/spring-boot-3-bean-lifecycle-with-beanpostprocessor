package com.example.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Custom BeanPostProcessor example
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("exampleBeanOne".equals(beanName) || "exampleBeanTwo".equals(beanName) || "exampleBeanThree".equals(beanName)) {
            System.out.println("BeanPostProcessor: Before Initialization of bean " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("exampleBeanOne".equals(beanName) || "exampleBeanTwo".equals(beanName) || "exampleBeanThree".equals(beanName)) {
            System.out.println("BeanPostProcessor: After Initialization of bean " + beanName);
        }
        return bean;
    }
}

