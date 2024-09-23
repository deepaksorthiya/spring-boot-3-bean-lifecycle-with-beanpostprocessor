package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private final Logger logger = LoggerFactory.getLogger(ExampleBeanOne.class);

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    private final ExampleBeanTwo exampleBeanTwo;

    // Called when bean is created
    public ExampleBeanOne(ExampleBeanTwo exampleBeanTwo) {
        logger.info("ExampleBeanOne :: ExampleBeanTwo is being setting in ExampleBeanOne calling constructor");
        this.exampleBeanTwo = exampleBeanTwo;
        logger.info("ExampleBeanOne :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        logger.info("ExampleBeanOne :: BeanNameAware: Bean name is set to {}", name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        logger.info("ExampleBeanOne :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        logger.info("ExampleBeanOne :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("ExampleBeanOne :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        logger.info("ExampleBeanOne :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        logger.info("ExampleBeanOne :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        logger.info("ExampleBeanOne :: Custom destroy method called");
    }

    //test method
    public void test() {
        logger.info("ExampleBeanOne :: test method called");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("ExampleBeanOne :: @PostConstruct postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("ExampleBeanOne :: @PreDestroy preDestroy");
    }
}

