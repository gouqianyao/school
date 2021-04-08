package com.java.oop.cls;


/*
 * 类加载的触发：
 * 	1：访问类成员变量时会加载，但static final 修饰的基本数据类型、字符串不会触发类加载
 * 		在编译时优化直接将值存入内存中，该区域是一个池。
 * 	2：除开以上情况其他都会加载
 * 
 */

class ClassC{
	static int a = 100;
	final static int b = 1000;
	final static String c = "sdf";
	static{
		System.out.println("static{}");
	}
	public static void show(){
		System.out.println("静态方法");
	}
	public final static void display(){
		System.out.println("display");
	}
}

public class TestClassObject05 {
	public static void main(String[] args) {
		//定义类变量不加载
		//隐式加载
//		ClassC c1;
		
		//显示加载,new对象会加载
//		new ClassC();
		
		
//		System.out.println(ClassC.a);//会加载
//		System.out.println(ClassC.b);//不会加载，常量会在编译时优化，直接放到内存的常量池。
//		System.out.println(ClassC.c);//不会加载
//		ClassC.show();//会加载
		ClassC.display();//会加载
	}
}
