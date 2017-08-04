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
@Table(name="monit_hosts")
public class MonitHost {
	
	/*monit id only one can read it*/
	@Id
	@Column(name="monit_id")
	private String monitId;
	
	/*monit version*/
	@Column(name="monit_version")
	private String monitVersion;
		
	/*remote host name*/
	@Column(name="monit_host_name")
	private String monitHostName;
	
	/*remote host IP*/
	@Column(name="monit_host_ip")
	private String monitHostIp;
	
	/*remote host status*/
	@Column(name="monit_host_status")
	private int monitHostStatus;
	
	/*remote host port*/
	@Column(name="monit_host_port")
	private String monitHostPort;
	
	/*system update time*/
	@Column(name="update_time")
	private String updateTime;
	
	/*platformName*/
	@Column(name="platform_name")
	private String platformName;
	
	/*platformRelease*/
	@Column(name="platform_release")
	private String platformRelease;
	
	/*platformVersion*/
	@Column(name="platform_version")
	private String platformVersion;
	
	/*platformMachine*/
	@Column(name="platform_machine")
	private String platformMachine;
	
	/*platformCpu*/
	@Column(name="platform_cpu")
	private int platformCpu;
	
	/*platformMem*/
	@Column(name="platform_mem")
	private int platformMem;
	
	/*platformSwap*/
	@Column(name="platform_swap")
	private int platformSwap;
	
	/*event count*/
	@Column(name="eventcount")
	private int eventcount;
	
	/**
	 * process object
	 * 一对多的关系，host -> process
	 * 如果多对一已经在多的一方开启，在一的一方，想要引入一对对，则
	 * @OneToMany(mappedBy = "company")
	 * */
	/**
	@OneToMany(orphanRemoval=true,fetch=FetchType.EAGER)
	@JoinColumn(name="monit_id")
	
	@OneToMany(mappedBy = "monitHost",fetch = FetchType.EAGER)
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name="teacher_student",joinColumns={@JoinColumn(name="tid")},inverseJoinColumns={@JoinColumn(name="sid")})
	**/
	@OneToMany(orphanRemoval=true,fetch=FetchType.EAGER)
	@JoinColumn(name="monit_id")
	private List<MonitProcess> monitProcesses = new ArrayList<MonitProcess>();

	public MonitHost() {
		super();
	}

	public MonitHost(String monitId, String monitVersion, String monitHostName, String monitHostIp, int monitHostStatus,
			String monitHostPort, String updateTime, String platformName, String platformRelease,
			String platformVersion, String platformMachine, int platformCpu, int platformMem, int platformSwap,
			int eventcount, List<MonitProcess> monitProcesses) {
		super();
		this.monitId = monitId;
		this.monitVersion = monitVersion;
		this.monitHostName = monitHostName;
		this.monitHostIp = monitHostIp;
		this.monitHostStatus = monitHostStatus;
		this.monitHostPort = monitHostPort;
		this.updateTime = updateTime;
		this.platformName = platformName;
		this.platformRelease = platformRelease;
		this.platformVersion = platformVersion;
		this.platformMachine = platformMachine;
		this.platformCpu = platformCpu;
		this.platformMem = platformMem;
		this.platformSwap = platformSwap;
		this.eventcount = eventcount;
		this.monitProcesses = monitProcesses;
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

	public List<MonitProcess> getMonitProcesses() {
		return monitProcesses;
	}

	public void setMonitProcesses(List<MonitProcess> monitProcesses) {
		this.monitProcesses = monitProcesses;
	}
}
