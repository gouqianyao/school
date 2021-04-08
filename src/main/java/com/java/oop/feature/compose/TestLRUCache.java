package com.java.oop.feature.compose;
import java.util.LinkedHashMap;
import java.util.Map;
class LRUCache{
	private LinkedHashMap<String, Object> map;
	private static int maxCap;
	public LRUCache(int maxCap) {
		this.maxCap = maxCap;
		this.map = new LinkedHashMap<String,Object>(maxCap, 0.75f, true) { 
			private static final long serialVersionUID = 1L;
			@Override
			protected boolean removeEldestEntry(Map.Entry<String,Object> eldest) {
				return size() > LRUCache.maxCap;
			}
		};
	}	
	public void set(String key, Object value) {
		this.map.put(key, value);
	}
	@Override
	public String toString() {
		return "LRUCache [map=" + map + ", maxCap=" + maxCap + "]";
	}
}
public class TestLRUCache {
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);
		cache.set("A", 100);
		cache.set("D", 400);
		cache.set("B", 200);
		cache.set("C", 300);
		System.out.println(cache);
	}
}
