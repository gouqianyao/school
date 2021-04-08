package com.gzcc.cache;

import java.util.Deque;
import java.util.LinkedList;

public class FifoCache implements Cache {
	private Cache cache;
	private int maxCap;
	private Deque<Object> keyList;
	public FifoCache(Cache cache) {
		this.cache = cache;
		maxCap = 3;
		keyList = new LinkedList<>();
	}
	@Override
	public void putObject(Object key, Object value) {
		keyList.addLast(key);
		if (keyList.size()>maxCap) {
			Object firstKey = keyList.removeFirst();
			removeObject(firstKey);
		}
		cache.putObject(key, value);
	}

	@Override
	public Object getObject(Object key) {
		return null;
	}

	@Override
	public Object removeObject(Object key) {
		return cache.removeObject(key);
	}
	@Override
	public String toString() {
		return "FifoCache [cache=" + cache + "]";
	}
	
	
}
