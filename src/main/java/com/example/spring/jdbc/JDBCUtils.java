package com.example.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JDBCUtils {
	
	public static Connection getConnection(String driverName
			,String subProtocol
			,String host
			,String port
			,String dbname
			,String username
			,String password){
		Connection connection = null;
		try {
			//com.MySQL.jdbc.Driver
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		StringBuffer driverUrl =  new StringBuffer();
		//jdbc:/mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=utf8
		driverUrl.append("jdbc:").append(subProtocol).append("://").append(host).append(":").append(port).append("/").append(dbname).append("?useUnicode=true&characterEncoding=utf8");
		try {
			connection = DriverManager.getConnection(driverUrl.toString(), username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	@Test
	public void jdbcTest() throws SQLException {
		Log log = LogFactory.getLog(JDBCUtils.class);		
		Connection connection = JDBCUtils.getConnection("com.mysql.jdbc.Driver", "mysql", "127.0.0.1", "3306", "mydb", "root", "piv@tal");
		Statement st = connection.createStatement();
		String sql = "select * from monit_hosts";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			log.info(rs.getString("monitId"));
			log.info(rs.getString("monitVersion"));
			log.info(rs.getString("monitHostName"));
			log.info(rs.getString("monitHostIp"));
			log.info(rs.getInt("monitHostStatus"));
			log.info(rs.getString("monitHostPort"));
		}
		connection.close();
	}

}
