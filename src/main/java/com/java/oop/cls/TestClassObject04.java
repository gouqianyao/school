package com.java.oop.cls;

import java.util.Date;

class ObjectFactory{
	public static Object newInstance(Class<?> cls) throws InstantiationException, IllegalAccessException{
		
		return cls.newInstance();
		
	}
}

public class TestClassObject04 {
	public static void main(String[] args) {
		try {
			Date object = (Date) ObjectFactory.newInstance(Date.class);
			System.out.println(object.toLocaleString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
