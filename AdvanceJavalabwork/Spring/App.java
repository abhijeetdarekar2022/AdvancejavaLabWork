package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.cdac.component.Atm;
import com.cdac.component.Calculator;
import com.cdac.component.HelloWorld;
import com.cdac.component.TextEditor;
import com.cdac.component.atmbank.Atm;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		HelloWorld hw = (HelloWorld)ctx.getBean("hello");
		System.out.println(hw.sayHello("Abhijeet"));
		
		Calculator c = ctx.getBean("calc", Calculator.class);
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(10, 20));
		
		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.load("abc.txt");
		
		Atm atm = (Atm)ctx.getBean("hdfcAtm-v2");
		atm.withdraw(10101010, 5500);
		
	}

}
