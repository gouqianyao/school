package com.java.oop.memory;

class Container{
	int[] array = new int[1024];
	@Override
	protected void finalize() throws Throwable {
		System.out.println("containerfinalize:");
		super.finalize();
	}

}

//演示对象被回收
//-XX:+PrintGCDetails
public class TestHeapMemory01 {
//	static Container c2;
	public static void main(String[] args) {
		Container c = new Container();
//		c2=c;
		c=null;
		//调用垃圾回收期
		System.gc();
	}
}
