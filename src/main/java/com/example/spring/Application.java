package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.spring.domain.MonitHost;
import com.example.spring.domain.MonitProcess;
import com.example.spring.jpa.MonitHostRepository;
import com.example.spring.jpa.MonitProcessRepository;

@SpringBootApplication
@ImportResource("classpath:datasource.xml")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		MonitHostRepository monitHost = (MonitHostRepository)context.getBean("monitHostRepository");
		MonitHost monit = monitHost.findByMonitId("02b2ae47-5ce4-401c-9682-02464ed90fe3");
		System.out.println(monit.getMonitHostName());
		List<MonitProcess> processes = monit.getMonitProcesses();
		System.out.println("start to....");
		for (MonitProcess process : processes) {
			System.out.println(process.getProcessName());
		}
		context.stop();
	}
}
