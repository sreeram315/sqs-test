package com.sqstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring boot application starter
 * @author Sreeram Maram
 */
@SpringBootApplication
public class Main extends SpringBootServletInitializer {
    public static void main(String[] args)  {
        SpringApplication.run(Main.class, args);
    }
}