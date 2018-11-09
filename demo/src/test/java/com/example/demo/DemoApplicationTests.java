package com.example.demo;

import com.example.demo.pojo.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void helloWorldTest() {
//		Given
		String hello = "Hello World";

//		When
		HelloWorld hi = new HelloWorld();

//		Then
		assertEquals(hello, hi.getHello());
	}
}
