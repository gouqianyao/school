package com.java.oop.instance;

class Member{
	int id;
	String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Member");
	}
}

public class TestObjectInstance02 {
	
	public static void main(String[] args) {
		
		
//		new Object();
		//1:类加载（如果没有加载过），同时在元数据区开辟内存。
		//2:在堆内存分配空间，初始化属性
		//3:执行构造方法
		//4:如上操作如有父类则先加载父类
		
		
		/*
		 *注意：
		 *		1：对象能重用就重用（对象的构造和销毁会消耗资源） 
		 *		2：对象能用局部变量引用，就不用实例变量或类变量
		 *		3：缓存或者池中的对象，能不用强引用则不用
		 */
		
		//1：强引用,引用堆内存中的对象,当有指向时，不会被回收
//		Member member = new Member(10, "asc");
//		member = null;
//		System.gc();
		
		
		//2:弱引用，当调用gc时，会及时收走，不管有没有引用。
//		WeakReference<Member> wr = new WeakReference<Member>(new Member(10, "fff"));
//		System.out.println(wr.get());
//		System.gc();
		
		//3：软引用,在内存快满时回收
		//①：软引用对象
//		SoftReference<Member> sr = new SoftReference<Member>(new Member(10, "sdfb"));
//		System.out.println(sr.get());
//		byte[] d = new byte[1024*1024*4];
//		System.gc();
		
		//4：虚引用，记录被回收的对象
		//PhantomReference<T>
		
		
	}

	
}
