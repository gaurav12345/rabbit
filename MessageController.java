package com.example.rabbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbit.service.RabbitSender;

@RestController
@RequestMapping(value = "/")
public class MessageController {
	
	@Autowired
	RabbitSender rabbitSender;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public void sendMessage(@PathVariable String name) {
		System.out.println("sending msg :" + name);
		rabbitSender.send(name);
	}
	

}
