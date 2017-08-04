package com.example.spring.dao.monit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.spring.domain.MonitHost;

@Repository("monitHostDao")
public class MonitHostDao implements MonitHostDaoInte{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MonitHost> getAllHosts() {
		String sql = "select * from monit_hosts";
		List<MonitHost> hosts = jdbcTemplate.query(sql, new RowMapper<MonitHost>(){

			@Override
			public MonitHost mapRow(ResultSet rs, int rowNum) throws SQLException {
				MonitHost host = new MonitHost();
				host.setMonitId(rs.getString("monitId"));
				host.setEventcount(rs.getInt("eventcount"));
				host.setMonitHostIp(rs.getString("monitHostIp"));
				host.setMonitHostName(rs.getString("monitHostName"));
				host.setMonitHostPort(rs.getString("monitHostPort"));
				host.setPlatformCpu(rs.getInt("platformCpu"));
				host.setPlatformMem(rs.getInt("platformMem"));
				return host;
			}			
		});
		return hosts;
	}
	
	public int createHost(MonitHost host) {
		
		String sql = "insert into monit_hosts (monitId, monitVersion, monitHostName, "
				+ "monitHostIp, monitHostStatus, monitHostPort, updateTime,platformName, "
				+ "platformRelease, platformVersion, platformMachine, platformCpu, platformMem, "
				+ "platformSwap, eventcount) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		int status = jdbcTemplate.update(sql, host.getMonitId(),host.getMonitVersion(),host.getMonitHostName(),
				host.getMonitHostIp(),host.getMonitHostStatus(),host.getMonitHostPort(),
				host.getUpdateTime(),host.getPlatformName(),host.getPlatformRelease(),host.getPlatformVersion(),
				host.getPlatformMachine(),host.getPlatformCpu(),host.getPlatformMem(),host.getPlatformSwap());
		return status;
	}

}
