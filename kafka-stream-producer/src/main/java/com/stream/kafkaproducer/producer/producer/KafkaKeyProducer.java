package com.stream.kafkaproducer.producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyProducer {

    private Logger log = LoggerFactory.getLogger(KafkaKeyProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String key, String data) {
        kafkaTemplate.send("multipartitions_mechanism", key, data);
        log.info("key -- " +key + " **  data " + data);
    }


}
