package com.stream.kafkaproducer.producer;

import com.stream.kafkaproducer.producer.producer.HelloKafkaProducer;
import com.stream.kafkaproducer.producer.producer.KafkaKeyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class KafkaStreamProducerApplication implements CommandLineRunner {

	//@Autowired
	//HelloKafkaProducer hellokfk ;

	@Autowired
	KafkaKeyProducer kfkkey;

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//hellokfk.sendHello(" TimeOut " + Math.random());
		for(int i = 0; i < 30; i++){
			var key = "key-" + (i % 4);
			var data = "data " + i + " with key " + key ;
			kfkkey.send(key,data);
		}

	}
}
