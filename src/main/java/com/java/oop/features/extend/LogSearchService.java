package com.java.oop.features.extend;

//常规方法可以通过继承重写方法实现，但当父类由final修饰时，无法继承
//public class LogSearchService extends DefaultSearchService {
//	@Override
//	public Object search(String key) {
//		long t1 = System.nanoTime();
//		Object result = super.search(key);
//		long t2 = System.nanoTime();
//		System.out.println("执行时长："+(t2-t1));
//		return result;
//	}
//	public static void main(String[] args) {
//		DefaultSearchService logSearchService = new LogSearchService();
//		logSearchService.search("12345");
//	}
//}
