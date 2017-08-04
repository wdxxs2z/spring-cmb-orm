package com.example.spring.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.spring.domain.MonitHost;
import com.example.spring.service.MonitHostServiceInte;

@Component
public class XmlDatasource {
	
	@Autowired
	private MonitHostServiceInte monitHostService;
	
	public MonitHostServiceInte getMonitHostService() {
		return monitHostService;
	}

	public void setMonitHostService(MonitHostServiceInte monitHostService) {
		this.monitHostService = monitHostService;
	}

	@Test
	public void testDao() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("datasource.xml");
		ctx.start();
		
		XmlDatasource xd = (XmlDatasource)ctx.getBean("xmlDatasource");
		MonitHostServiceInte hostService = xd.getMonitHostService();
		
		List<MonitHost> hosts = hostService.getAllMonitHosts();
		for (MonitHost host : hosts) {
			System.out.println(host.getMonitId());
		}
	}

}
