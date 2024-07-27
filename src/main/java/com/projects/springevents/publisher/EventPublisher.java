package com.projects.springevents.publisher;

import com.projects.springevents.event.SampleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publishEvent(SampleEvent event){
        System.out.println("Publishing event : " + event.getMessage());
        applicationContext.publishEvent(event);
    }

}
