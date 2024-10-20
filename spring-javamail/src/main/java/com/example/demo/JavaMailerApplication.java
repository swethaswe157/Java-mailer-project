package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.mailService.javaMailerService;
@SpringBootApplication
	public class JavaMailerApplication {
	@Autowired
	private javaMailerService jm;

	public static void main(String[] args) {
		SpringApplication.run(JavaMailerApplication.class, args);
	}
@EventListener(ApplicationReadyEvent.class)
public void send() {
	jm.sendMail("swetha.a-b.ed-22@mjc.ac.in","testmail","testing content for mail-java mail project");
}
	
}
