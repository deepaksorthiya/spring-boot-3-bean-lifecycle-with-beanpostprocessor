package com.example.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    private ExampleBeanThree exampleBeanThree;

    // Called when bean is created
    public ExampleBeanTwo(ExampleBeanThree exampleBeanThree) {
        System.out.println("ExampleBeanTwo :: ExampleBeanThree is being setting in ExampleBeanTwo calling constructor");
        this.exampleBeanThree = exampleBeanThree;
        System.out.println("ExampleBeanTwo :: Bean is being instantiated by calling constructor");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("ExampleBeanTwo :: BeanNameAware: Bean name is set to " + name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("ExampleBeanTwo :: BeanFactoryAware: BeanFactory is set");
    }

    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ExampleBeanTwo :: ApplicationContextAware: ApplicationContext is set");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ExampleBeanTwo :: InitializingBean: afterPropertiesSet() method called");
    }

    // Custom init method
    public void customInit() {
        System.out.println("ExampleBeanTwo :: Custom init method called");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("ExampleBeanTwo :: DisposableBean: destroy() method called");
    }

    // Custom destroy method
    public void customDestroy() {
        System.out.println("ExampleBeanTwo :: Custom destroy method called");
    }

    //test method
    public void test() {
        System.out.println("ExampleBeanTwo :: test method called");
    }
}

