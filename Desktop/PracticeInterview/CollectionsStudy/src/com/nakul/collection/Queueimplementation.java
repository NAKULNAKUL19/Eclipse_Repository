package com.nakul.collection;

import java.sql.Time;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Queueimplementation {
	public void queueImplementation()
	{

	Queue<Integer> queue=new ArrayDeque<>();
	Queue<Integer> queue2=new LinkedList<>();
	Date obj=new Date();

	System.out.println(obj);

	queue.add(90000);
	queue.add(623);
	queue.add(9323);
	
		
	queue2.add(9000);
	queue2.add(623);
	queue2.add(9323);
	int m;
	System.out.println(queue);
	 m=queue.poll();
	System.out.println(m);
	
	
	

	System.out.println(m);
	m=queue2.poll();
	System.out.println(m);
	System.out.println(queue+" "+queue2);

	}

}
