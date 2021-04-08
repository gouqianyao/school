package com.gzcc.cache;

public interface Cache {
	public abstract void putObject(Object key, Object value);
	public abstract Object getObject(Object key);
	public abstract Object removeObject(Object key);
}
