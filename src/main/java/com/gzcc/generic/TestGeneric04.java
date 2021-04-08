package com.gzcc.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestGeneric04 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Date date = ObjectFactory.getObject(Date.class);
		System.out.println(date.toString());
		List<Object> list = ObjectFactory.getObject(ArrayList.class);
		list.add("hello");
		list.add(100);
		System.out.println(list);
		
	}
}
class ObjectFactory{
	//泛型方法
	static <T> T getObject(Class<T> cls) throws InstantiationException, IllegalAccessException{
		return cls.newInstance();
	}
}

class ContainerUtil<T>{
	/*
	 * 泛型对静态方法参数或返回值无效，静态方法的泛型只能用在方法泛型
	 */
	public  static <T>void sort(List<T> list) {
		
	}
}
