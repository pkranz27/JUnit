import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
	@Test
	
	public void testGetMessage() throws Throwable {
	
		HelloWorld hw = new HelloWorld();
	
		assertEquals("Hello, World!", hw.getMessage());
	
	}
	
	
	
	@Test
	
	public void testGetMessage2() throws Throwable {
	
		HelloWorld hw = new HelloWorld();
	
		assertEquals("Hello, Jason!", hw.getMessage("Jason"));
	
	}
	public void testGreeting() throws Throwable{
		HelloWorld hw = new HelloWorld();
	}
}
