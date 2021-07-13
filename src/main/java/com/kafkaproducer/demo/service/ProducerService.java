package com.kafkaproducer.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafkaproducer.demo.model.GreetingModel;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProducerService {
	private static final String TOPIC = "test-topic-3";
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public void sendMessage(GreetingModel message) {
		log.info(String.format("#### -> Producer message -> %s", message));
		
		this.kafkaTemplate.send(TOPIC,message);
	}

}
