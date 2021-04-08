package com.java.oop.cls;

import java.util.HashMap;
import java.util.Map;


class ClassE{
//	static ClassE instance = new ClassE();
	Map<String, Object> map = new HashMap<>();
	{
		System.out.println("{}");
	}
	public ClassE() {
		System.out.println("ClassE");
		map.put("A", 100);
		map.put("B", 200);
	}
}

//-XX:+TraceClassLoading
public class TestClassObject07 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.java.oop.ClassE");
	}
}
