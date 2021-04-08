package com.gzcc.abs;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariDataSource;
interface DataSourceFactory {
	public static DataSource getInstance() {
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql:///yonghedb?characterEncoding=utf-8");
		ds.setUsername("root");
		ds.setPassword("123");
		return ds;
	}
}
