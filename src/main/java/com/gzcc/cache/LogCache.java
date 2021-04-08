package com.gzcc.cache;


public class LogCache implements Cache {
	private Cache cache;
	private int requests;
	private int hits;
	
	public LogCache(Cache cache ) {
		this.cache = cache;
	}
	
	
	@Override
	public void putObject(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getObject(Object key) {
		requests++;
		Object obj = cache.getObject(key);
		if (obj!=null) {
			hits++;
		}
		System.out.println("命中率："+getRequestsHits());
		return obj;
	}
	
	//获取命中率
	public double getRequestsHits() {
		return hits/requests;
	}
	
	@Override
	public Object removeObject(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
