package com.deepoove.cargo.infrastructure.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.shared.DomainEventPublisher;
import com.google.common.eventbus.EventBus;

@Component
public class GuavaDomainEventPublisher implements DomainEventPublisher {

    @Autowired
    EventBus eventBus;

    public void publish(Object event) {
        eventBus.post(event);
    }

}
