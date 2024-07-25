package com.example;

import com.example.beans.ExampleBeanOne;
import com.example.beans.ExampleBeanThree;
import com.example.beans.ExampleBeanTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(Application.class);

    private final ExampleBeanOne exampleBeanOne;
    private final ExampleBeanTwo exampleBeanTwo;
    private final ExampleBeanThree exampleBeanThree;

    public Application(ExampleBeanOne exampleBeanOne, ExampleBeanTwo exampleBeanTwo, ExampleBeanThree exampleBeanThree) {
        this.exampleBeanOne = exampleBeanOne;
        this.exampleBeanTwo = exampleBeanTwo;
        this.exampleBeanThree = exampleBeanThree;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("ExampleBeanOne {}", exampleBeanOne);
        logger.info("ExampleBeanTwo {}", exampleBeanTwo);
        logger.info("ExampleBeanThree {}", exampleBeanThree);
        exampleBeanOne.test();
        exampleBeanTwo.test();
        exampleBeanThree.test();
    }
}
