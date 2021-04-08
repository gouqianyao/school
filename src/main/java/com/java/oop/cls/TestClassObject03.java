package com.java.oop.cls;

//双亲委派

public class TestClassObject03 {
	public static void main(String[] args) {
		ClassLoader loader1 = ClassLoader.getSystemClassLoader();//appClassLoader负责加载我们自己写的类
		System.out.println("loader1"+loader1);
		ClassLoader loader2 = loader1.getParent();//ExtClassLoader负责加载jdk/lib/etx/*.jar
		System.out.println("loader2"+loader2);
		ClassLoader loader3 = loader2.getParent();//BootstrapClassLoader负责加载jdk/lib/rt.jar
		System.out.println("loader3"+loader3);
		
	}
}
