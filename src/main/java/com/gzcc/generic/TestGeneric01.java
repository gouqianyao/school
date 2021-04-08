package com.gzcc.generic;

import java.io.Serializable;


public class TestGeneric01 {
	public static void main(String[] args) {
		LinkedContainer lc = new LinkedContainer();
		lc.add("100");
	}
}
//定义泛型接口
interface Container<T>{
	void add(T t);
	T get(int index);
}

//定义泛型类
class ArrayContainer<T> implements Container<T>{
	public void add(T t){};
	public T get(int index){return null;}
}

/*
 * 泛型类（假如泛型类实现的接口是一个泛型接口）
 * 那么该类要么为接口传入一个具体的类型，要么定义为和接口一样的泛型
 */
class LinkedContainer implements Container<Serializable>{

	@Override
	public void add(Serializable t) {
	}

	@Override
	public Serializable get(int index) {
		return null;
	}

	
	
}


