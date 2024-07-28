package com.projects.springevents.listerners;

import com.projects.springevents.event.SampleEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventListener2 {

    @EventListener
    @Async
    public void onEvent(SampleEvent event) {
        System.out.println("Event Listener 2 received: " + event.getMessage());
    }
}
