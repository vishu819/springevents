package com.projects.springevents.listerners;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextEventListener {

    @EventListener
    public void onEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Listener received: " + event.getSource());
    }


    @EventListener
    public void onEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Listener received: " + event.getSource());
    }

    /**
     * This method listens for the {@link ContextRefreshedEvent} and logs a message when it is received.
     *
     * @param event The {@link ContextRefreshedEvent} that triggered this method.
     *              This event is published when the application's context is fully initialized and ready for use.
     * @return void This method does not return any value.
     */
    @EventListener
    public void onEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent Listener received: " + event.getSource());
    }
}
