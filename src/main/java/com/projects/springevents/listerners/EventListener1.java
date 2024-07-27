package com.projects.springevents.listerners;

import com.projects.springevents.event.SampleEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener1 {

    @EventListener
    public void onEvent(SampleEvent event) {
        System.out.println("Event Listener 1 received: " + event.getMessage());
    }

    /**
     * Listens for ContextRefreshedEvent and SampleEvent.
     * Prints a message when the event is received.
     */
    @EventListener(classes = {ContextRefreshedEvent.class, SampleEvent.class})
    public void onEvent() {
        System.out.println("Even received when any event (ContextRefreshedEvent or SampleEvent) is received");
    }
}
