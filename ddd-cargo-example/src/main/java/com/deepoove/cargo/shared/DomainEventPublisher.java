package com.deepoove.cargo.shared;

public interface DomainEventPublisher {
    public void publish(Object event);

}
