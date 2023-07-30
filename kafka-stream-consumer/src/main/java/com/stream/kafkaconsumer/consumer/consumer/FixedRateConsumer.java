package com.stream.kafkaconsumer.consumer.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FixedRateConsumer {

    private Logger log = LoggerFactory.getLogger(FixedRateConsumer.class);

    @KafkaListener(topics = "t_fixedrate")
    public void consume(String message){
        log.info("Consuming message " + message);
        //System.out.println(message);
    }

//
}
