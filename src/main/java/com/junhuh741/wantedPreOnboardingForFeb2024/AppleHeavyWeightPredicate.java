package com.junhuh741.wantedPreOnboardingForFeb2024;

public class AppleHeavyWeightPredicate implements ApplePredicate {
	public boolean filter(Apple apple) {
		return apple.weight > 15;
	}
}
