package com.deepoove.cargo.common;

public interface DomainEventPublisher {
    public void publish(Object event);

}
