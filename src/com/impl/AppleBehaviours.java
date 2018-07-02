package com.impl;

import java.util.ArrayList;
import java.util.List;

import com.beans.Apple;
import com.beans.Banana;
import com.util.Utility;

public class AppleBehaviours {

	
	public static void main(String[] args) {
		List<Banana> list= new ArrayList<>();
		Banana a =new  Banana("green", 10, 150);
		Banana b =new  Banana("green", 15, 150);
		Banana c =new  Banana("green", 13, 250);
		Banana d =new  Banana("red", 10, 10);
		Banana e =new  Banana("red", 10, 150);
		Banana f =new  Banana("green", 110, 1150);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		
		List<Banana> greenApple=Utility.filterFruit(list, (Banana apple)-> (apple.getWeight()>140 && apple.getColor().equals("red")) );
		
		System.out.println(greenApple);
	}
}
