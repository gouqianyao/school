package com.gzcc.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class TestGeneric03<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	@Override
	public synchronized E get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}
	
	public synchronized boolean add(E e) {
		return super.add(e);
		};
}

class TestHashMap<K, V> extends HashMap<K, V>{
	private static final long serialVersionUID = 1L;
	@Override
	public synchronized V put(K key, V value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}
	@Override
	public synchronized V get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key);
	}
}


