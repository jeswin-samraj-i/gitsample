package org.sample2;

import java.util.ArrayList;
import java.util.List;

public class SampleList5 {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> li2=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		li2.add(10);
		li2.add(20);
		li2.add(60);
		li2.add(50);
		li2.add(40);
		li2.add(70);
		li2.add(80);
		li2.add(90);
		
		System.out.println(li2);
		
		li.retainAll(li2);
		
		System.out.println("\n"+li);
		
		
		
	}

}
