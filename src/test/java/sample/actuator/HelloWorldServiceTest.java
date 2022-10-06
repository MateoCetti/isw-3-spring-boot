package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Hola Hola",helloWorldService.getHelloMessage());
	}

	@Test
	public void miTest() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Hola Hola","Hola Hola",helloWorldService.getHelloMessage());
		assertEquals("Hello Hello","Hello Hello",helloWorldService.getHelloMessage());
	}
}
