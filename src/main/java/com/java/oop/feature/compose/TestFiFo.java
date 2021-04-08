package com.java.oop.feature.compose;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TestFiFo {
	//借助此对象缓存数据
	private Map<String, Object> cache; 
	//借助此对象记录key的添加顺序
	private LinkedList<String> keyList = new LinkedList<>();
	//定义数据存放最大容量
	private int maxCap;
	
	public TestFiFo(int maxCap) {
		this.maxCap = maxCap;
		cache = new HashMap<String, Object>(maxCap);//无序
	}
	//负责将数据存入cache中
	public void put(String key, Object value) {
		//1:记录key的顺序
		keyList.addLast(key);
		//2：判断map是否溢出
		if (keyList.size()>maxCap) {
			cache.remove(keyList.removeFirst());
		}
		//3：添加元素= new HashMap<String, Object>();
		cache.put(key, value);
	}
	
	
	@Override
	public String toString() {
		return "TestFiFo [cache=" + cache + "]";
	}
	public static void main(String[] args) {
		TestFiFo testFiFo = new TestFiFo(3);
		testFiFo.put("A",100);
		testFiFo.put("D",400);
		testFiFo.put("B",200);
		testFiFo.put("C",300);
		System.out.println(testFiFo);

	}
	
}
