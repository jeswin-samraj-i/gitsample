package com.sample;

import java.util.ArrayList;
import java.util.List;

public class SampleList4 {
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		Integer i = li.get(2);
		System.out.println(i);
		
		System.out.println("index value\n"+li.get(4));

	}

}
