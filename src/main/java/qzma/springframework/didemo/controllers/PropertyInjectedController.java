package qzma.springframework.didemo.controllers;

import qzma.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController
{
	public GreetingServiceImpl greetingService;

	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
