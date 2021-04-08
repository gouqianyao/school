package com.gzcc;

import java.io.InputStream;
import java.util.Properties;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer {
	//读取配置文件
	static Properties prop = new Properties();
	static{
		try {
			InputStream in = TomcatServer.class.
					getClassLoader().getResourceAsStream("application.properties");
			prop.load(in);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			//启动server
			//创建tomcat对象
			Tomcat tomcat = new Tomcat();
			//创建conntor对象
			Connector connector = new Connector("HTTP/1.1");
			//通过配置文件设置端口号
			connector.setPort(Integer.parseInt(prop.getProperty("server.port")));
			//获取超时
			connector.setAsyncTimeout(Integer.parseInt(prop.getProperty("server.connectTimeout")));
			//将conn放入tomcat
			tomcat.getService().addConnector(connector);
			//启动server
			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
