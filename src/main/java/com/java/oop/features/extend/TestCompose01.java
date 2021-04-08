package com.java.oop.features.extend;

public class TestCompose01 {
	public static void main(String[] args) {
		TimeSearchService timeSearchService = new TimeSearchService(new DefaultSearchService());
		timeSearchService.search("asdfghjkl");
	}
}
