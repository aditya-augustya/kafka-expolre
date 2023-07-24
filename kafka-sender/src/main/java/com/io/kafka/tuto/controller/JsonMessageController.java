package com.io.kafka.tuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.kafka.tuto.kafka.JsonKafkaProducer;
import com.io.kafka.tuto.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

	
	private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    
	
	@Autowired
	private KafkaTemplate<String, Object> template;
    
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        //template.send("tutodekafka", user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
    
    
    
	
}
