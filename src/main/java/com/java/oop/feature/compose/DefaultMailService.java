package com.java.oop.feature.compose;

public final class DefaultMailService implements MailService{

	@Override
	public Object send(String name) {
		System.out.println("邮件已发送");
		return "have a send";
	}
	
}
