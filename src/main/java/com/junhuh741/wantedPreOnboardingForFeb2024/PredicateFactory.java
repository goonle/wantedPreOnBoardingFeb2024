package com.junhuh741.wantedPreOnboardingForFeb2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jakarta.annotation.PostConstruct;

public class PredicateFactory {
	private Set<ApplePredicate> applePredicateSet;
	private Map<String, ApplePredicate> predicate;
	
	@PostConstruct
	public void init() {
		createPredicate(applePredicateSet);
	}
	
	public void createPredicate(Set<ApplePredicate> predicateSet) {
		predicate = new HashMap<String, ApplePredicate>();
		predicateSet.forEach(p -> predicate.put(p.getFilterName(), p));
	}
	
	public ApplePredicate findBy(String className) {
		return predicate.get(className);
	}
	
}
