package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;



public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts2");
		
		//model/entity classes are not instantiated using Spring
		CarPart cp = new CarPart();
		cp.setPartName("Nut and Bolt");
		cp.setCarModel("Maruti 800");
		cp.setPrice(50);
		cp.setQuantity(75);
		
		long ms1 = System.currentTimeMillis();
		inv.addNewPart(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
		
	}

}
