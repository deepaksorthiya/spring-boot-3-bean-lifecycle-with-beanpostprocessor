package com.example.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    private final ExampleBeanTwo exampleBeanTwo;

    // Called when bean is created
    public ExampleBeanOne(ExampleBeanTwo exampleBeanTwo) {
        System.out.println("ExampleBeanOne :: ExampleBeanTwo is being setting in ExampleBeanOne calling constructor");
        this.exampleBeanTwo = exampleBeanTwo;
        System.out.println("ExampleBeanOne :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("ExampleBeanOne :: BeanNameAware: Bean name is set to " + name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("ExampleBeanOne :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ExampleBeanOne :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ExampleBeanOne :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        System.out.println("ExampleBeanOne :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("ExampleBeanOne :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        System.out.println("ExampleBeanOne :: Custom destroy method called");
    }

    //test method
    public void test() {
        System.out.println("ExampleBeanOne :: test method called");
    }
}

