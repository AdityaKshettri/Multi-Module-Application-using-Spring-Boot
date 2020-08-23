package com.aditya.multimodule.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aditya.multimodule"})
@EntityScan(basePackages = {"com.aditya.multimodule"})
@EnableJpaRepositories(basePackages = {"com.aditya.multimodule"})
public class App {
    public static void main(String args[]) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
