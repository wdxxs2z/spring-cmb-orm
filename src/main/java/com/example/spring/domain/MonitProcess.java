package com.example.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="monit_process")
public class MonitProcess {
	
	/*process id*/
	@Id
	@Column(name="process_id")
	private int process_id;
	
	/*process collected_sec*/
	@Column(name="collected_sec")
	private String collected_sec;
	
	/*collected_usec*/
	@Column(name="collected_usec")
	private String collected_usec;

	/*process name muti one monit to mult processes*/
	@Column(name="process_name")
	private String processName;
	
	/*process status 0 stand alive*/
	@Column(name="process_status")
	private int processStatus;
	
	/*process status_message*/
	@Column(name="status_message")
	private String processStatusMessage;
	
	/*process pid*/
	@Column(name="process_pid")
	private String processPid;
	
	/*process Uptime*/
	@Column(name="process_uptime")
	private String processUptime;
	
	/*process children*/
	@Column(name="process_children")
	private int processChildren;
	
	/*process memPercenttotal*/
	@Column(name="process_mem_percenttotal")
	private float processMemPercenttotal;
	
	/*process memKilobytetotal*/
	@Column(name="process_mem_kilobytetotal")
	private int processMemKilobytetotal;
	
	/*process cpuPercenttotal*/
	@Column(name="process_cpu_percenttotal")
	private float processCpuPercenttotal;
	
	/*process monitId*/
	@Column(name="monit_id")
	private String monitId;
	
//	private MonitHost monitHost;
//	
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.EAGER)
//    @JoinColumn(name = "mid")
//	public MonitHost getMonitHost() {
//		return monitHost;
//	}
//
//	public void setMonitHost(MonitHost monitHost) {
//		this.monitHost = monitHost;
//	}

	public MonitProcess(int process_id, String collected_sec, String collected_usec, String processName,
			int processStatus, String processStatusMessage, String processPid, String processUptime,
			int processChildren, float processMemPercenttotal, int processMemKilobytetotal,
			float processCpuPercenttotal, String monitId) {
		super();
		this.process_id = process_id;
		this.collected_sec = collected_sec;
		this.collected_usec = collected_usec;
		this.processName = processName;
		this.processStatus = processStatus;
		this.processStatusMessage = processStatusMessage;
		this.processPid = processPid;
		this.processUptime = processUptime;
		this.processChildren = processChildren;
		this.processMemPercenttotal = processMemPercenttotal;
		this.processMemKilobytetotal = processMemKilobytetotal;
		this.processCpuPercenttotal = processCpuPercenttotal;
		this.monitId = monitId;
	}
	
	public MonitProcess() {
		super();
	}

	public int getProcess_id() {
		return process_id;
	}

	public void setProcess_id(int process_id) {
		this.process_id = process_id;
	}

	public String getCollected_sec() {
		return collected_sec;
	}

	public void setCollected_sec(String collected_sec) {
		this.collected_sec = collected_sec;
	}

	public String getCollected_usec() {
		return collected_usec;
	}

	public void setCollected_usec(String collected_usec) {
		this.collected_usec = collected_usec;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public int getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessStatusMessage() {
		return processStatusMessage;
	}

	public void setProcessStatusMessage(String processStatusMessage) {
		this.processStatusMessage = processStatusMessage;
	}

	public String getProcessPid() {
		return processPid;
	}

	public void setProcessPid(String processPid) {
		this.processPid = processPid;
	}

	public String getProcessUptime() {
		return processUptime;
	}

	public void setProcessUptime(String processUptime) {
		this.processUptime = processUptime;
	}

	public int getProcessChildren() {
		return processChildren;
	}

	public void setProcessChildren(int processChildren) {
		this.processChildren = processChildren;
	}

	public float getProcessMemPercenttotal() {
		return processMemPercenttotal;
	}

	public void setProcessMemPercenttotal(float processMemPercenttotal) {
		this.processMemPercenttotal = processMemPercenttotal;
	}

	public int getProcessMemKilobytetotal() {
		return processMemKilobytetotal;
	}

	public void setProcessMemKilobytetotal(int processMemKilobytetotal) {
		this.processMemKilobytetotal = processMemKilobytetotal;
	}

	public float getProcessCpuPercenttotal() {
		return processCpuPercenttotal;
	}

	public void setProcessCpuPercenttotal(float processCpuPercenttotal) {
		this.processCpuPercenttotal = processCpuPercenttotal;
	}

	public String getMonitId() {
		return monitId;
	}

	public void setMonitId(String monitId) {
		this.monitId = monitId;
	}
}
