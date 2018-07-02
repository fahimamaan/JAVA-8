package com.impl;

import com.beans.Apple;
import com.interf.ApplePredicate;

public class AppleByWeight implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight()>150;
	}

}
