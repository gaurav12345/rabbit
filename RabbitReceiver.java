package com.example.rabbit.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RabbitReceiver {

	@RabbitListener(queues = "messagequeue")
	public void receiver(String msg) {
		// TODO Auto-generated method stub
		System.out.println("msg received : " + msg);
	}

}
