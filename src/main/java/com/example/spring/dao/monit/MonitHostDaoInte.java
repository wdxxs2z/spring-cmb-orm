package com.example.spring.dao.monit;

import java.util.List;

import com.example.spring.domain.MonitHost;

public interface MonitHostDaoInte {
	public List<MonitHost> getAllHosts();
	public int createHost(MonitHost host);
}
