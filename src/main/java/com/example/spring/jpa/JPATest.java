package com.example.spring.jpa;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.spring.domain.MonitHost;
import com.example.spring.domain.MonitProcess;

@Component
public class JPATest {

	@Test
	public void testJpa() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("datasource.xml");
		ctx.start();
		
		//JPATest xd = (JPATest)ctx.getBean("jPATest");
		MonitHostRepository mp = (MonitHostRepository)ctx.getBean("monitHostRepository");
		
		MonitHost monitHost = mp.findByMonitId("b9b290f4-63be-4794-9b6d-65b9ae840b9a");
		List<MonitProcess> processes = monitHost.getMonitProcesses();
		for (MonitProcess process : processes) {
			System.out.println(process.getProcessPid());
		}
	}

}
