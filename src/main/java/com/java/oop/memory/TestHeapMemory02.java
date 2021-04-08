package com.java.oop.memory;


//-Xms5m -Xmx5m -XX:+PrintGCDetails
//为jvm分配内存空间
public class TestHeapMemory02 {
	public static void main(String[] args) {
		byte[] arr1 = new byte[1024*1024];
		byte[] arr2 = new byte[1024*1024];
		byte[] arr3 = new byte[1024*1024];
		byte[] arr4 = new byte[1024*1024];
		byte[] arr5 = new byte[1024*1024];
	}
}
