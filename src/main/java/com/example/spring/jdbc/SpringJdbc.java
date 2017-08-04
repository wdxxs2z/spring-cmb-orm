package com.example.spring.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.spring.domain.MonitHost;
import com.example.spring.service.MonitHostService;

public class SpringJdbc {
	
	@Test
	public void testSpringJdbcTem() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("piv@tal");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		
		JdbcTemplate template = new JdbcTemplate(ds);
		template.execute("create table users(id int primary key,username varchar(64))");
	}

}
