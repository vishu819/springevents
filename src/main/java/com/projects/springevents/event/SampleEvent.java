package com.projects.springevents.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SampleEvent {
    private String message;
}
