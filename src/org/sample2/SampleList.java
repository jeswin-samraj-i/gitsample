package org.sample2;

import java.util.LinkedList;
import java.util.List;

public class SampleList {
	
	public static void main(String[] args) {
		
		List<Integer> li=new LinkedList<Integer>();
		
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
	
		
	for (Integer i : li) {
		
		System.out.println(i);
		
	}
		
	}

}
