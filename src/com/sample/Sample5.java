package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample5 {
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
		int s = li.size();
		
		for (int i = 0; i < s; i++) {
			
			Integer in = li.get(i);
			System.out.println(in);
			
		}
		
		
		
		
		
		
		
		
	}

}
