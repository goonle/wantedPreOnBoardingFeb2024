package com.junhuh741.wantedPreOnboardingForFeb2024;

public interface ApplePredicate {
	public default String getFilterName() {
		return getClass().getSimpleName();
	}
	
	public abstract boolean filter(Apple apple);
	
}
