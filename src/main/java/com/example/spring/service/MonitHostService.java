package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.dao.monit.MonitHostDao;
import com.example.spring.dao.monit.MonitHostDaoInte;
import com.example.spring.domain.MonitHost;

@Service("monitHostService")
public class MonitHostService implements MonitHostServiceInte{
	
	@Autowired
	private MonitHostDaoInte monitHostDao;
	
	public List<MonitHost> getAllMonitHosts() {
		return monitHostDao.getAllHosts();
	}
	
	public void saveMonitHost(MonitHost host) {
		monitHostDao.createHost(host);
	}

}
