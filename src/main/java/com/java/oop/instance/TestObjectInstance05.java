package com.java.oop.instance;
//方案3：线程安全，无阻塞的单例设计
//适合高并发，小对象
class Singleton05{
	int arr[] = new int[2048];
	//构造方法私有化，不允许外界直接构建对象
	private Singleton05(){
		System.out.println("Singleton05");
	}
	//类加载时对象创建只创建一次
	private static Singleton05 instance = 
				new Singleton05();
	
	
	public static Singleton05 getInstance(){
		return instance;
	}
	public static void show(){}
}//此单例的缺陷？可能占用资源比较多，尤其是大对象
public class TestObjectInstance05 {

	public static void main(String[] args) {
		//doTestManyThread02();
		Singleton05.show();
	}

	private static void doTestManyThread02() {
		class Task implements Runnable{
			@Override
			public void run() {
				Singleton05.getInstance();		
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
