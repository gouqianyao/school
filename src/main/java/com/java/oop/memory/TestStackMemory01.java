package com.java.oop.memory;

class Stack{}
public class TestStackMemory01 {
	static Stack s2;
	public static void main(String[] args) {
		//小对象，占用资源少，可能会被分配到栈上
		//栈上分配
		Stack stack = new Stack();
		//逃逸对象(被方法外部的对象所指向)
		//不会在栈上分配
		s2 = new Stack();
		
	}
}
