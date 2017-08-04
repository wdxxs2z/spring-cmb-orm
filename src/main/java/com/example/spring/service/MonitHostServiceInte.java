package com.example.spring.service;

import java.util.List;

import com.example.spring.domain.MonitHost;

public interface MonitHostServiceInte {
	
	public List<MonitHost> getAllMonitHosts();
	
	public void saveMonitHost(MonitHost host);

}
