package com.gzcc.abs;


interface IB{
	//jdk8之后，接口中不仅可以写常量和静态方法
	//静态方法直接调用 
	static void display(){
		System.out.println("display");
	}
	//default方法需要实现后调用
	default void show(){
		System.out.println("show");
	}
}

class IBimpl implements IB{}

public class TestInterface01 {
	public static void main(String[] args) {
		IB.display();
		IBimpl iBimpl = new IBimpl();
		iBimpl.show();
	}
}
