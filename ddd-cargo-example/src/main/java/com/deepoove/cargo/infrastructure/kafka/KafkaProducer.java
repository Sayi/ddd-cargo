package com.deepoove.cargo.infrastructure.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value("${app.topic.foo}")
    private String topic;

    public void send(Object message) {
        kafkaTemplate.send(topic, message);

    }

}
