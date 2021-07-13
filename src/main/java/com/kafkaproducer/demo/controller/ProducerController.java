package com.kafkaproducer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kafkaproducer.demo.model.GreetingModel;
import com.kafkaproducer.demo.service.ProducerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class ProducerController {
	@Autowired
	private ProducerService producerService;
	
	@PostMapping
	public String publishMessage(@RequestBody GreetingModel entity) {
		producerService.sendMessage(entity);
		return "Enviado";
	}
}
