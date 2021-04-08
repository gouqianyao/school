package com.java.oop.instance;
//方案4：线程安全，无阻塞的单例设计，并且不占用资源
// 适合大对象，频繁使用（高并发）
class Singleton06{
	int arr[] = new int[2048];
	//构造方法私有化，不允许外界直接构建对象
	private Singleton06(){
		System.out.println("Singleton05");
	}
	//通过内部类延迟加载，节省资源占用
	static class Inner{
		private static Singleton06 instance = 
				new Singleton06();
	}
	
	public static Singleton06 getInstance(){
		return Inner.instance;
	}
	public static void show(){}
}
public class TestObjectInstance06 {

	public static void main(String[] args) {
		doTestManyThread02();
		//Singleton06.show();
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
