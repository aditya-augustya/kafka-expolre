package com.io.kafka.tuto.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.io.kafka.tuto.payload.User;


@Service
public class JsonKafkaProducer {
	// jsonKafkaProducer

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	private KafkaTemplate<String, User> kafkaTemplate;

	public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
		//super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(User data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "tutodekafka_json")
                //.setHeader(KafkaHeaders.TOPIC, headerValue: "dddd")
                .build();

        kafkaTemplate.send(message);
    }
	
	
}
