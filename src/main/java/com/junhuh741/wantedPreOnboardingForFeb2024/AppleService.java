package com.junhuh741.wantedPreOnboardingForFeb2024;

import java.util.ArrayList;
import java.util.List;

public class AppleService {
	private PredicateFactory factory;
	
	public List<Apple> getFilteredAppleList(List<Apple> appleList, String className){
		List<Apple> result = new ArrayList<Apple>();
		ApplePredicate predicate = factory.findBy(className);
		for(Apple apple : appleList) {
			if(predicate.filter(apple))
				result.add(apple);
		}
		return result;
	}
}
