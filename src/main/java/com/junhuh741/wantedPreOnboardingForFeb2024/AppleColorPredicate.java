package com.junhuh741.wantedPreOnboardingForFeb2024;

import static com.junhuh741.wantedPreOnboardingForFeb2024.Color.GREEN;

public class AppleColorPredicate implements ApplePredicate{
	public boolean filter(Apple apple) {
		return GREEN.equals(apple.color);
	}

}
