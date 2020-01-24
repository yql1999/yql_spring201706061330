package cn.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void testHello() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hello.xml");
		Hello hello=(Hello) applicationContext.getBean("hello");
		hello.sayHello();
	}
	
	public static void main(String[] args) {
		testHello();
	}
	
	
}
