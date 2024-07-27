package com.projects.springevents.controller;

import com.projects.springevents.event.SampleEvent;
import com.projects.springevents.publisher.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is a REST controller for handling events in a Spring Boot application.
 * It exposes a POST endpoint to publish a custom event.
 */
@RestController
public class SpringEventsController {

    /**
     * An instance of the EventPublisher class, which is responsible for publishing events.
     */
    @Autowired
    EventPublisher eventPublisher;

    /**
     * This method handles the POST request to publish a custom event.
     *
     * @param event The custom event to be published.
     * @return A ResponseEntity indicating the success of the event publishing.
     */
    @PostMapping("/publish-event")
    public ResponseEntity publishEvent(@RequestBody SampleEvent event) {
        eventPublisher.publishEvent(event);
        return ResponseEntity.ok("Event published successfully");

    }
}
