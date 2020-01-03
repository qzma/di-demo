package qzma.springframework.didemo.Controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import qzma.springframework.didemo.controllers.PropertyInjectedController;
import qzma.springframework.didemo.controllers.SetterInjectedController;
import qzma.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest
{
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() throws Exception{
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
	}
}
