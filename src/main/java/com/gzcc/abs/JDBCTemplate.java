package com.gzcc.abs;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
public class JDBCTemplate {
	private DataSource dataSource;

	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
	}

	public Connection getConnection() throws SQLException {
		
		return  dataSource.getConnection();
	}
		
}