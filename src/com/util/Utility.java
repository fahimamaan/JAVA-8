package com.util;

import java.util.ArrayList;
import java.util.List;

import com.beans.Apple;
import com.interf.ApplePredicate;
import com.interf.FruitPredicate;

public class Utility {

	
	public static List<Apple> filterApple(List<Apple> inventory,ApplePredicate p) {
		
		List<Apple> list = new ArrayList<>();
		for(Apple apple: inventory) {
			if(p.test(apple))
				list.add(apple);
		}
		return list;
	}
	
	public static <T> List<T> filterFruit(List<T> inventory, FruitPredicate<T> t){
		List<T> result = new ArrayList<>();
		
		 for(T t1:inventory) {
			 if(t.test(t1))
				 result.add(t1);
		 }
		return result;
	}
}
