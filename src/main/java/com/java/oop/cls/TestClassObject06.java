package com.java.oop.cls;
//延迟加载，优化资源使用
class ClassD{
	static{
		System.out.println("static");
	}
	static class inner{
		static{
			System.out.println("inner static");
		}
		static int[] array = new int[1024];
		}
	public static void doSayHello(){
		System.out.println("hello");
	}
}

public class TestClassObject06 {
	public static void main(String[] args) {
		ClassD.doSayHello();
	}
}
