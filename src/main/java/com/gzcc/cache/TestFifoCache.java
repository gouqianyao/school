package com.gzcc.cache;

public class TestFifoCache {
	public static void main(String[] args) {
//		FifoCache fifoCache = new FifoCache(new PerpetualCache());
		LogCache cache = new LogCache(new FifoCache(new PerpetualCache()));
		cache.putObject("A",100);
		cache.putObject("C",300);
		cache.putObject("B",200);
		cache.putObject("D",400);
		
		cache.getObject("A");
		cache.getObject("C");
		
		
		
	}
}
