package com.gzcc.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric05 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		List<String> list = new ArrayList<String>();
		list.add("A");
//		list.add(1000);
		//将整数通过反射添加到list中
		//1：获取list的字节码对象
		Class<?> cls = list.getClass();
		//2：获取list集合中的add方法对象
		Method method = cls.getMethod("add",int.class, Object.class);
		
		//3：通过反射执行list集合的add方法
		method.invoke(list, 0,1000);
		System.out.println(list);
	}
}
