package com.java.oop.cls;
//编写程序，验证在类加载时，静态代码块是否被加载--不一定
class ClassA{
	
	static{
		System.out.println("静态块加载");
	}
	
}
//-XX:+TraceClassLoading
public class TestClassObject02 {
	public static void main(String[] args) throws ClassNotFoundException {
		//类加载方式一
//		Class<ClassA> class1 = ClassA.class; //不会加载静态代码快
		
		//类加载方式二
//		Class.forName("com.java.oop.ClassA");//会执行静态代码块
		
		//类加载方式三
		//手动控制是否加载静态代码块
//		Class.forName("com.java.oop.ClassA", true, ClassLoader.getSystemClassLoader());
		
		//类加载方式四 
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		loader.loadClass("com.java.oop.ClassA");//不加载静态代码块
		
		
		
	}
}
