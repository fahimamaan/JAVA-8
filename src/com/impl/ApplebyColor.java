package com.impl;

import com.beans.Apple;
import com.interf.ApplePredicate;

public class ApplebyColor implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals("green");
	}

}
