package com.sample;

import java.util.ArrayList;
import java.util.List;

public class MockTask {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		
		for (int i = 0; i < li.size(); i++) {
		//Integer li1 = li.get(i);
			
				if (li.get(i).equals(10)) {
					System.out.println(i);
					
				}
				
			}
			
		}
}		
		
		
	
	


