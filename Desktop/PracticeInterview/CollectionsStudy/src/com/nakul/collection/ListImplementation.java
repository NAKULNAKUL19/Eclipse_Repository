package com.nakul.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class ListImplementation {
	public List<Integer> generic=new ArrayList<>();
	
	static  int  count=8;
	public static void main(String[] args) {
		Queueimplementation obj3=new Queueimplementation();
		obj3.queueImplementation();
		ListImplementation obj=new ListImplementation();
		NewClassForListConcept obj1=new NewClassForListConcept();
		
		//System.out.println(obj);
	
	List<String> list=new ArrayList<>();
	
	Map<String,Integer> treemap=new TreeMap<>();
	Map<String,Integer> hashmap=new HashMap<>();
	Map<String,Integer> linkedhashmap=new LinkedHashMap<>();
while(count>0)
	{
	hashmap.put("nakul",1);
	hashmap.put("chanu",2);
	hashmap.put("deviprasad",3);
	hashmap.put("pratik",4);
	
	treemap.put("nakul",1);
	treemap.put("chanu",2);
	treemap.put("deviprasad",3);
	treemap.put("pratik",4);
	
	
	linkedhashmap.put("nakul",1);
	linkedhashmap.put("chanu",2);
	linkedhashmap.put("deviprasad",3);
	linkedhashmap.put("pratik",4);
	
	
	count--;
	}
System.out.println(hashmap);
System.out.println(treemap);
System.out.println(linkedhashmap);
	}

	@Override
	public String toString() {
	
		return "ListImplementation []";
		
	}

}
