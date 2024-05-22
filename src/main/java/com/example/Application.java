package com.example;

import com.example.beans.ExampleBeanOne;
import com.example.beans.ExampleBeanThree;
import com.example.beans.ExampleBeanTwo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

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
        System.out.println("ExampleBeanOne" + exampleBeanOne);
        System.out.println("ExampleBeanTwo" + exampleBeanTwo);
        System.out.println("ExampleBeanThree" + exampleBeanThree);
        exampleBeanOne.test();
        exampleBeanTwo.test();
        exampleBeanThree.test();
    }
}
