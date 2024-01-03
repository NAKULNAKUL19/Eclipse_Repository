package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		
		Map<Integer,String> nakul=new HashMap<Integer,String>();
	
	
Map<Integer,NakulCar> car=new HashMap<Integer,NakulCar>();
car.put(1,new NakulCar("punch","black"));
car.put(2,new NakulCar("Nexon","white"));




		nakul.put(1,"NEXON");
		nakul.put(2,"Punch");
		nakul.put(3,"Thar");
		nakul.put(4,"Maruti S Cross");
		
	System.out.println(nakul);
	nakul.remove(3);
	
	System.out.println(nakul);
SortedMap<Integer,String> nakul2=new TreeMap<Integer,String>(nakul);
	
	nakul2.put(1,"NEXON");
	nakul2.put(2,"Punch");
	nakul2.put(3,"Thar");
	nakul2.put(4,"Maruti S Cross");
	nakul2.put(5,"Scorpio");
	System.out.println(nakul2);
	
	Comparator<String> stringLength=new Comparator<String>() {
		@Override
		public int compare(String s1,String s2)
		{
			System.out.println("Im calling a comparator "+s1+" "+s2);
		return s1.length()-s2.length();
		}
	};
	
	for(Entry<Integer,String> entry: nakul2.entrySet())
	
	{
		System.out.println(entry);
	}
	
	
	System.out.println(stringLength.compare("al","naku;"));
	}
	
	
	
	



}
