//package com.deepoove.cargo.infrastructure.mq;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
////@Component
//public class KafkaMQProducer implements MQProducer{
//
//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    @Value("${app.topic.foo}")
//    private String topic;
//
//    @Override
//    public void send(Object message) {
//        kafkaTemplate.send(topic, message);
//    }
//
//}
