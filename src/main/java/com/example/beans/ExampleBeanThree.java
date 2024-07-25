package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private final Logger logger = LoggerFactory.getLogger(ExampleBeanOne.class);

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    // Called when bean is created
    public ExampleBeanThree() {
        logger.info("ExampleBeanThree :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        logger.info("ExampleBeanThree :: BeanNameAware: Bean name is set to {}", name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        logger.info("ExampleBeanThree :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        logger.info("ExampleBeanThree :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("ExampleBeanThree :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        logger.info("ExampleBeanThree :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        logger.info("ExampleBeanThree :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        logger.info("ExampleBeanThree :: Custom destroy method called");
    }

    //test method
    public void test() {
        logger.info("ExampleBeanThree :: test method called");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("ExampleBeanThree :: @PostConstruct postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("ExampleBeanThree :: @PreDestroy preDestroy");
    }
}

