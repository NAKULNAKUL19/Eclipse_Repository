package com.application.ioc_demo;

import org.springframework.stereotype.Component;

@Component
public class Vodafone implements Sim {
public static int count=0;
	Vodafone()
	{
		count++;
	}
public void calling()
{
	System.out.println("Vodafone sim is calling");
}


public void data()
{
System.out.println("Vodafone data is browsing");
	
}

}
