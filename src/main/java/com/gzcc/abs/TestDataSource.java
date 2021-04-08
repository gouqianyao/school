package com.gzcc.abs;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

public class TestDataSource {
	public static void main(String[] args) throws SQLException {
		JDBCTemplate jt = new JDBCTemplate();
		jt.setDataSource(DataSourceFactory.getInstance());
		Connection conn = jt.getConnection();
		System.out.println(conn);
		
	}
}
