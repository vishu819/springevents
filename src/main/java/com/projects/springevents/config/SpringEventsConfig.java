package com.projects.springevents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan("com.projects")
@EnableAsync
public class SpringEventsConfig {

//    @Bean
//    public SimpleApplicationEventMulticaster getSimpleApplicationEventMulticasterBean(SimpleApplicationEventMulticaster bean) {
//
//        return
//
//    }

}
