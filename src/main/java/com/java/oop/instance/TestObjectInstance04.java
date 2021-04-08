package com.java.oop.instance;
//方案2：线程安全，有阻塞或少阻塞的单例设计
//低并发，大对象
class Singleton03{
	//构造方法私有化，不允许外界直接构建对象
	private Singleton03(){
		System.out.println("Singleton03");
	}
	
	private static volatile Singleton03 instance;
	//volatile 关键字的作用（修饰类中的属性）
	//1.保证线程的可见性
	//2.禁止指令重排序
	//3.但不能保证其原子性
	public static Singleton03 getInstance(){
		if(instance==null){		
			synchronized(Singleton01.class){
				if(instance==null){			
					instance = new Singleton03();
				}	
			}	
		}
		return instance;
	}
}
public class TestObjectInstance04 {

	public static void main(String[] args) {
		//doTestSingleThread01();
		doTestManyThread02();
	}

	private static void doTestManyThread02() {
		class Task implements Runnable{
			@Override
			public void run() {
				Singleton03.getInstance();		
			}			
		}
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread(new Task());
		Thread t3 = new Thread(new Task());
		t1.start();
		t2.start();
		t3.start();
	}
}
