package com.java.oop.instance;

/**
 * 面试：谈谈你对单例模式的认识？
 * 对象单例设计：设计类时保证类的实例在内存中只有一份
 * 1.内部设计实现（对类自身进行设计）
 * 2.外部设计实现（对类的对象提供一种池）
 */
//方案1：能实现单例，但是线程不安全
class Singleton01{
	//构造方法私有化，不允许外界直接构建对象
	private Singleton01(){
		System.out.println("Singleton01");
	}
	//此类设计存在线程不安全？
	//思考出现不安全的原因？
	//1.多个线程并发执行
	//2.多个线程共享数据集
	//3.多个线程在共享数据集上的操作是非原子操作
	private static Singleton01 instance;
	//synchronized保证代码的原子性(不能同时有多个线程访问)
	//synchronized要保证多个线程在这个代码块上顺序执行
	//此设计虽然保证了线程安全，但是性能下降
	public static Singleton01 getInstance(){
		if(instance==null){				
			instance = new Singleton01();
		}	
		return instance;
	}
}
public class TestObjectInstance03 {

	public static void main(String[] args) {
		//doTestSingleThread01();
		doTestManyThread02();
	}

	private static void doTestManyThread02() {
		class Task implements Runnable{
			@Override
			public void run() {
				Singleton01.getInstance();		
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
