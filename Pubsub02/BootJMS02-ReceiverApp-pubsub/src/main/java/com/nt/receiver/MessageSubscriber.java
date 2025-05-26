package com.nt.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageSubscriber {
	@JmsListener(destination = "testtopic1")
	public void readMessage(String message) {
		System.out.println("message is :: "+message);
	}
}
