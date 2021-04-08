package com.java.oop.features.extend;


public class TimeSearchService {
	private  DefaultSearchService searchService;
	public TimeSearchService(DefaultSearchService searchService) {
		this.searchService = searchService;
	}
	public Object search(String key){
		long t1 = System.nanoTime();
		Object result = searchService.search(key);
		long t2 = System.nanoTime();
		System.out.println("执行时长："+(t2-t1));
		return result; 
	}

	
}
