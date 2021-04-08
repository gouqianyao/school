package com.gzcc.cache;

import java.util.HashMap;
import java.util.Map;

public class PerpetualCache implements Cache {
	Map<Object, Object> cache = new HashMap<Object, Object>();
	@Override
	public void putObject(Object key, Object value) {
		cache.put(key, value);
	}
	@Override
	public Object getObject(Object key) {
		return cache.get(key);
		
	}
	@Override
	public Object removeObject(Object key) {
		cache.remove(key);
		return null;
	}
	@Override
	public String toString() {
		return cache.toString();
	}
	
}
