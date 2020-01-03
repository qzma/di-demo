package qzma.springframework.didemo.controllers;

import qzma.springframework.didemo.services.GreetingService;
import qzma.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController
{
	private GreetingService greetingService;

	public String sayHello(){
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
