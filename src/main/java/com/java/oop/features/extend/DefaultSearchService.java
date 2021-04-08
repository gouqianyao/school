package com.java.oop.features.extend;


public final class DefaultSearchService {
	
	public Object search(String key) {
//		long t1 = System.nanoTime();
		System.out.println("search by key");
//		long t2 = System.nanoTime();
//		System.out.println("本次搜索耗时:"+(t2-t1)+"纳秒");
		return "result from database";
	}
	
	public static void main(String[] args) {
		DefaultSearchService defaultSearchService = new DefaultSearchService();
		 defaultSearchService.search("sdfg");
	}
}
