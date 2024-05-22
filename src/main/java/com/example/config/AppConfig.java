package com.example.config;

import com.example.beans.CustomBeanPostProcessor;
import com.example.beans.ExampleBeanOne;
import com.example.beans.ExampleBeanThree;
import com.example.beans.ExampleBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public ExampleBeanOne exampleBeanOne(ExampleBeanTwo exampleBeanTwo) {
        return new ExampleBeanOne(exampleBeanTwo);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public ExampleBeanTwo exampleBeanTwo(ExampleBeanThree exampleBeanThree) {
        return new ExampleBeanTwo(exampleBeanThree);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public ExampleBeanThree exampleBeanThree() {
        return new ExampleBeanThree();
    }

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}
