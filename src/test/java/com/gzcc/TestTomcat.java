package com.gzcc;



import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;

public class TestTomcat {
	@Test
	public void testTomcat(){
		try {
			Tomcat tomcat = new Tomcat();
			System.out.println("当前线程:"+Thread.currentThread().getName());
			Connector connector = new Connector("HTTP/1.1");
			connector.setPort(8080);
			tomcat.getService().addConnector(connector);
			
			Context ctx = tomcat.addContext("/", null);
			
			//添加一个servlet
			Tomcat.addServlet(ctx,"helloServlet", "com.gzcc.HelloServlet");
			ctx.addServletMappingDecoded("/hello","helloServlet");
			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
