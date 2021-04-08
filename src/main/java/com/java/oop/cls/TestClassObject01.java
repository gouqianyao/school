package com.java.oop.cls;

public class TestClassObject01 {
	public static void main(String[] args) {
		//-XX:+TraceClassLoading 呈现类的加载过程，通过配置jvm参数实现
		//main方法中args用于接收程序运行时的数据
		System.out.println("main args[0]:"+args[0]);
		System.out.println("main args[0]:"+args[1]);
	}
}
