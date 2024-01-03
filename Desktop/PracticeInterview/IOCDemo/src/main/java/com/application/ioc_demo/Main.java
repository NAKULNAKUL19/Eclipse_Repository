package com.application.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.style.ToStringCreator;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class Main {

	public static void main(String[] args) {
		Vodafone obj=new Vodafone();
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
System.out.println("config loaded");
Airtel airtel=context.getBean("airtel",Airtel.class);
airtel.calling();
airtel.data()
;	
Vodafone vodafon=context.getBean("vodafon",Vodafone.class);
vodafon.calling();
vodafon.data()
;	

	
System.out.println(obj.count);	
	
	}
}
