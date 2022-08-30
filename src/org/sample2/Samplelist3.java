package org.sample2;

import java.util.LinkedList;
import java.util.List;

public class Samplelist3 {
	public static void main(String[] args) {
		
		List<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		
	int last = li.lastIndexOf(10);
	
	
	li.remove(last);
	System.out.println(li);
		
		
		
		
	}

}
