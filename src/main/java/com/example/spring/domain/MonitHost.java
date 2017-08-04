package com.example.spring.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="monit_host")
public class MonitHost {
	
	/*monit id only one can read it*/
	@Id
	@Column(name="monitId")
	private String monitId;
	
	/*monit version*/
	private String monitVersion;
		
	/*remote host name*/
	private String monitHostName;
	
	/*remote host IP*/
	private String monitHostIp;
	
	/*remote host status*/
	private int monitHostStatus;
	
	/*remote host port*/
	private String monitHostPort;
	
	/*system update time*/
	private String updateTime;
	
	/*platformName*/
	private String platformName;
	
	/*platformRelease*/
	private String platformRelease;
	
	/*platformVersion*/
	private String platformVersion;
	
	/*platformMachine*/
	private String platformMachine;
	
	/*platformCpu*/
	private int platformCpu;
	
	/*platformMem*/
	private int platformMem;
	
	/*platformSwap*/
	private int platformSwap;
	
	/*event count*/
	private int eventcount;
	
	/*process object*/
	@OneToMany(mappedBy="monitHost",fetch=FetchType.EAGER,cascade={ CascadeType.ALL })
	@JoinColumn(name="monit_id")
	//@OneToMany(mappedBy="monitHost")
	private List<MonitProcess> monitProcesses = new ArrayList<MonitProcess>();

	public MonitHost() {
		super();
	}

	public String getMonitId() {
		return monitId;
	}

	public void setMonitId(String monitId) {
		this.monitId = monitId;
	}

	public String getMonitVersion() {
		return monitVersion;
	}

	public void setMonitVersion(String monitVersion) {
		this.monitVersion = monitVersion;
	}

	public String getMonitHostName() {
		return monitHostName;
	}

	public void setMonitHostName(String monitHostName) {
		this.monitHostName = monitHostName;
	}

	public String getMonitHostIp() {
		return monitHostIp;
	}

	public void setMonitHostIp(String monitHostIp) {
		this.monitHostIp = monitHostIp;
	}

	public int getMonitHostStatus() {
		return monitHostStatus;
	}

	public void setMonitHostStatus(int monitHostStatus) {
		this.monitHostStatus = monitHostStatus;
	}

	public String getMonitHostPort() {
		return monitHostPort;
	}

	public void setMonitHostPort(String monitHostPort) {
		this.monitHostPort = monitHostPort;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformRelease() {
		return platformRelease;
	}

	public void setPlatformRelease(String platformRelease) {
		this.platformRelease = platformRelease;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getPlatformMachine() {
		return platformMachine;
	}

	public void setPlatformMachine(String platformMachine) {
		this.platformMachine = platformMachine;
	}

	public int getPlatformCpu() {
		return platformCpu;
	}

	public void setPlatformCpu(int platformCpu) {
		this.platformCpu = platformCpu;
	}

	public int getPlatformMem() {
		return platformMem;
	}

	public void setPlatformMem(int platformMem) {
		this.platformMem = platformMem;
	}

	public int getPlatformSwap() {
		return platformSwap;
	}

	public void setPlatformSwap(int platformSwap) {
		this.platformSwap = platformSwap;
	}

	public int getEventcount() {
		return eventcount;
	}

	public void setEventcount(int eventcount) {
		this.eventcount = eventcount;
	}
}
