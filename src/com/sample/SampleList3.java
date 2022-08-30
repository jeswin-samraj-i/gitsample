package com.sample;

import java.util.LinkedList;
import java.util.List;

public class SampleList3 {
	public static void main(String[] args) {
		
		List<Integer>  li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		int i = li.lastIndexOf(10);
		
		System.out.println(i);
		
		
		
		
		
	}

}
