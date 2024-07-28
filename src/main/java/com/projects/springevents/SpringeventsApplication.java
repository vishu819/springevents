package com.projects.springevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringeventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringeventsApplication.class, args);
    }

}
