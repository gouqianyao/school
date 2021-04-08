package com.java.oop.instance.ThreadLocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ThreadLocal是java中提供的一种对象类型，通过此类型的对象，可以将某个对象绑定到当前线程
 * 也可以从当前线程获取某个对象
 * 常用方法：
 * 	1：.get() 从当前线程获取绑定的对象
 * 	2：.set(object) 将对象绑定到当前线程
 * 
 *  借助ThreadLocal实现线程内部单例
 *  1：即保证了线程安全
 *  2：又保证了性能
 * @author 14193
 *
 */
public class TestThreadLocal01 {
	public static void main(String[] args) throws ParseException {
		new Thread(){
			@Override
			public void run() {
				Date date = DateUtil.format("2021-04-07");
				System.out.println(date);
			}
		}.start();;
	}
}

class DateUtil{
	//线程不安全
//	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private  static ThreadLocal<SimpleDateFormat> td = new ThreadLocal<SimpleDateFormat>(){
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		};
	};
	public static Date format(String dataStr) {
		try {
			return td.get().parse(dataStr);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}