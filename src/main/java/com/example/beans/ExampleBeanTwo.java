package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private final Logger logger = LoggerFactory.getLogger(ExampleBeanOne.class);

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    private ExampleBeanThree exampleBeanThree;

    // Called when bean is created
    public ExampleBeanTwo(ExampleBeanThree exampleBeanThree) {
        logger.info("ExampleBeanTwo :: ExampleBeanThree is being setting in ExampleBeanTwo calling constructor");
        this.exampleBeanThree = exampleBeanThree;
        logger.info("ExampleBeanTwo :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        logger.info("ExampleBeanTwo :: BeanNameAware: Bean name is set to {}", name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        logger.info("ExampleBeanTwo :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        logger.info("ExampleBeanTwo :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("ExampleBeanTwo :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        logger.info("ExampleBeanTwo :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        logger.info("ExampleBeanTwo :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        logger.info("ExampleBeanTwo :: Custom destroy method called");
    }

    //test method
    public void test() {
        logger.info("ExampleBeanTwo :: test method called");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("ExampleBeanTwo :: @PostConstruct postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("ExampleBeanTwo :: @PreDestroy preDestroy");
    }
}

