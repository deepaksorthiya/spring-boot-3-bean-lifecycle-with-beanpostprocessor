package com.example.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    // Called when bean is created
    public ExampleBeanThree() {
        System.out.println("ExampleBeanThree :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("ExampleBeanThree :: BeanNameAware: Bean name is set to " + name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("ExampleBeanThree :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ExampleBeanThree :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ExampleBeanThree :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        System.out.println("ExampleBeanThree :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("ExampleBeanThree :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        System.out.println("ExampleBeanThree :: Custom destroy method called");
    }

    //test method
    public void test() {
        System.out.println("ExampleBeanThree :: test method called");
    }
}

