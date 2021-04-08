package com.java.oop.feature.compose;

public class LogMailService {
	MailService service;
	public LogMailService(MailService service) {
		this.service = service;
	}
	public Object send(String name) {
		long t1 = System.nanoTime();
		Object result = service.send(name);
		long t2 = System.nanoTime();
		System.out.println("邮件"+name+"发送完毕，耗时："+(t2-t1));
		return result;
	}
	public static void main(String[] args) {
		LogMailService service = new LogMailService(new DefaultMailService());
		service.send("send");
	}
	
}
