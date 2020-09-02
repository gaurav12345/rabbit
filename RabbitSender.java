package com.example.rabbit.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${rabbit.exchange}")
	private String exchange;

	@Value("${rabbit.routingkey}")
	private String routingkey;
	

	public void send(String msg) {
		rabbitTemplate.convertAndSend(exchange, routingkey, msg);
    
	}
	
}
