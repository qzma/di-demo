package qzma.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import qzma.springframework.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
	private GreetingService greetingService;

	// no need to add @autowire
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")  GreetingService greetingService)
	{

		this.greetingService = greetingService;
	}

	public String sayHello(){
		return greetingService.sayGreeting();
	}

}
