package org.sample2;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class SampList4 {
	public static void main(String[] args) {
		
		List<Integer>	li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		
		li.add(8, 80);
		
		System.out.println(li);

}
}