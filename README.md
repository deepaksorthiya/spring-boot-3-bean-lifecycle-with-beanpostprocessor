[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-3-bean-lifecycle-with-beanpostprocessor/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-3-bean-lifecycle-with-beanpostprocessor/actions/workflows/maven-build.yml)

# Getting Started

## Requirements:

```
Spring Boot : 3.4.1
Java : 17
Maven 3.9 +
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-3-bean-lifecycle-with-beanpostprocessor.git
```

```bash
cd spring-boot-3-bean-lifecycle-with-beanpostprocessor
```

## Start application using:

```bash
./mvnw spring-boot:run
```

## Bean LifeCycle Order

* <p>Bean factory implementations should support the standard bean lifecycle interfaces
* as far as possible. The full set of initialization methods and their standard order is:
* <ol>
* <li>BeanNameAware's {@code setBeanName}
* <li>BeanClassLoaderAware's {@code setBeanClassLoader}
* <li>BeanFactoryAware's {@code setBeanFactory}
* <li>EnvironmentAware's {@code setEnvironment}
* <li>EmbeddedValueResolverAware's {@code setEmbeddedValueResolver}
* <li>ResourceLoaderAware's {@code setResourceLoader}
* (only applicable when running in an application context)
* <li>ApplicationEventPublisherAware's {@code setApplicationEventPublisher}
* (only applicable when running in an application context)
* <li>MessageSourceAware's {@code setMessageSource}
* (only applicable when running in an application context)
* <li>ApplicationContextAware's {@code setApplicationContext}
* (only applicable when running in an application context)
* <li>ServletContextAware's {@code setServletContext}
* (only applicable when running in a web application context)
* <li>{@code postProcessBeforeInitialization} methods of BeanPostProcessors
* <li>InitializingBean's {@code afterPropertiesSet}
* <li>a custom {@code init-method} definition
* <li>{@code postProcessAfterInitialization} methods of BeanPostProcessors
* </ol>

## OUTPUT

```
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: Bean is being instantiated by calling constructor
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: BeanNameAware: Bean name is set to exampleBeanThree
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: BeanFactoryAware: BeanFactory is set
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: ApplicationContextAware: ApplicationContext is set
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: Before Initialization of bean exampleBeanThree
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: @PostConstruct postConstruct
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: InitializingBean: afterPropertiesSet() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: Custom init method called
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: After Initialization of bean exampleBeanThree
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: ExampleBeanThree is being setting in ExampleBeanTwo calling constructor
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: Bean is being instantiated by calling constructor
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: BeanNameAware: Bean name is set to exampleBeanTwo
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: BeanFactoryAware: BeanFactory is set
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: ApplicationContextAware: ApplicationContext is set
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: Before Initialization of bean exampleBeanTwo
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: @PostConstruct postConstruct
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: InitializingBean: afterPropertiesSet() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: Custom init method called
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: After Initialization of bean exampleBeanTwo
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: ExampleBeanTwo is being setting in ExampleBeanOne calling constructor
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: Bean is being instantiated by calling constructor
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: BeanNameAware: Bean name is set to exampleBeanOne
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: BeanFactoryAware: BeanFactory is set
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: ApplicationContextAware: ApplicationContext is set
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: Before Initialization of bean exampleBeanOne
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: @PostConstruct postConstruct
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: InitializingBean: afterPropertiesSet() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: Custom init method called
 c.example.beans.CustomBeanPostProcessor  : BeanPostProcessor: After Initialization of bean exampleBeanOne
 com.example.Application                  : Started Application in 0.791 seconds (process running for 1.242)
 com.example.Application                  : ExampleBeanOne com.example.beans.ExampleBeanOne@6a74d228
 com.example.Application                  : ExampleBeanTwo com.example.beans.ExampleBeanTwo@349d0836
 com.example.Application                  : ExampleBeanThree com.example.beans.ExampleBeanThree@6a714237
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: test method called
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: test method called
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: test method called
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: @PreDestroy preDestroy
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: DisposableBean: destroy() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanOne :: Custom destroy method called
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: @PreDestroy preDestroy
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: DisposableBean: destroy() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanTwo :: Custom destroy method called
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: @PreDestroy preDestroy
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: DisposableBean: destroy() method called
 com.example.beans.ExampleBeanOne         : ExampleBeanThree :: Custom destroy method called
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)

