package com.java.oop.features;

import java.awt.datatransfer.FlavorListener;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * LinkHashMap:
 * 数据结构：链表+散列表
 * 算法：记录元素的添加顺序，记录元素的访问顺序
 * @author 14193
 *
 */
public class TestLRUcache {
	public static void main(String[] args) {
//		doTestLRUCache();
		LRUCache lruCache = new LRUCache(3);
		lruCache.put("A",100);
		lruCache.put("C",300);
		lruCache.put("D",400);
		lruCache.put("B",200);
		System.out.println(lruCache);
	}

	private static void doTestLRUCache() {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(
				3,//初始容量
				0.75f,//负载因子
				false//记录访问顺序
				){
					private static final long serialVersionUID = 1L;
						@Override
						protected boolean removeEldestEntry(Entry<String, Integer> eldest) {
						return size()>3;
				}
			
		};
		map.put("A", 100);
		map.put("B", 200); 
		map.put("E", 500);
		map.put("C", 300);
		map.put("D", 400);
		System.out.println(map);
	}
}
class LRUCache extends LinkedHashMap<String, Integer>{

	private static final long serialVersionUID = 1L;
	private int maxCap;
	public LRUCache(int maxCap) {
		super(maxCap,0.75f,true);
		this.maxCap = maxCap;
	}
	@Override
	protected boolean removeEldestEntry(Entry<String, Integer> eldest) {
		return size()>maxCap;
	}
	
}