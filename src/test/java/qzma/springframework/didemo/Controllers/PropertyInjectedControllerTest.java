package qzma.springframework.didemo.Controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;

import qzma.springframework.didemo.controllers.PropertyInjectedController;
import qzma.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest
{
	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
	}
}
