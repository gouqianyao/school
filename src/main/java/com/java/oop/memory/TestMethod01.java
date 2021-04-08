package com.java.oop.memory;
//测试方法栈：方法调用时会执行入栈操作，方法结束会执行出栈操作
public class TestMethod01 {
	public static void main(String[] args) {
		doMethod01();
	}

	private static void doMethod01() {
		doMethod02();
	}

	private static void doMethod02() {
		Thread thread = Thread.currentThread();
		System.out.println("当前线程"+thread.getName());
		StackTraceElement[] st = thread.getStackTrace();
		for (StackTraceElement st1 : st) {
			System.out.println(st1.getMethodName());
		}
		
	}
}
