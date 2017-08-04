
DROP DATABASE IF EXISTS mydb;
CREATE DATABASE mydb DEFAULT CHARACTER SET utf8;
USE mydb;

/*==============================================================*/
/* Table: hosts 监控主机信息表                                  */
/*==============================================================*/
drop table if exists monit_hosts;
create table monit_hosts
(
   monitId varchar(255) not null primary key,   /*Monit ID monit的唯一标示*/
   monitVersion varchar(16),                    /*monit 的版本*/
   monitHostName varchar(32),                   /*monit 安装端的主机名*/
   monitHostIp varchar(42),                     /*monit 安装端的IP*/
   monitHostStatus int,                         /*monit 安装端的主机状态 0：存活 1：未连接*/
   monitHostPort varchar(6),                    /*monit 安装端的接收端口*/
   updateTime varchar(16),                      /*系统运行时间*/
   platformName varchar(20),                    /*平台名*/
   platformRelease varchar(255),                /*平台内核版本*/
   platformVersion varchar(255),                /*平台内核编译时间*/
   platformMachine varchar(255),                /*平台系统架构*/
   platformCpu int,                             /*平台CPU个数*/
   platformMem int,                             /*平台内存使用*/
   platformSwap int,                            /*平台交换区使用*/
   eventcount int                               /*事件个数*/
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: hosts 监控主机内的进程信息表                          */
/*==============================================================*/
drop table if exists monit_process;
create table monit_process (
process_id INT(5) AUTO_INCREMENT NOT NULL primary key,
processName varchar(16),                     /*进程名*/
processStatus int,                           /*进程状态*/
status_message varchar(64),                  /*进程状态信息*/
collected_sec varchar(32),                   /*收集进程数据开始时间*/
collected_usec varchar(16),                  /*收集进程数据持续时间*/
processPid varchar(8),                       /*进程的PID*/
processUptime varchar(16),                   /*进程运行时间*/
processChildren int,                         /*进程的子进程数*/
processMemPercenttotal numeric(4,1),         /*进程内存占用百分比*/
processMemKilobytetotal int,                 /*进程占用内存数 KB*/
processCpuPercenttotal numeric(4,1),         /*进程占用CPU百分比*/
monitId varchar(255)                         /*关联monit*/
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into monit_hosts (monitId, monitVersion, monitHostName, monitHostIp, monitHostStatus, monitHostPort, updateTime,platformName, platformRelease, platformVersion, platformMachine, platformCpu, platformMem, platformSwap, eventcount) 
 values ("02b2ae47-5ce4-401c-9682-02464ed90fe3", "5.8", "diego_cell", "10.10.190.2", 0, "2190", "2016/10/08", "Linux", "4.3", "2014/1/2", "x86-64", 2, 4096, 1024, 5);
 
 insert into monit_hosts (monitId, monitVersion, monitHostName, monitHostIp, monitHostStatus, monitHostPort, updateTime,platformName, platformRelease, platformVersion, platformMachine, platformCpu, platformMem, platformSwap, eventcount) 
 values ("b9b290f4-63be-4794-9b6d-65b9ae840b9a", "5.8", "diego_brain", "10.10.190.10", 0, "2190", "2016/10/08", "Linux", "4.3", "2014/1/2", "x86-64", 2, 2048, 1024, 0);
 
 insert into monit_hosts (monitId, monitVersion, monitHostName, monitHostIp, monitHostStatus, monitHostPort, updateTime,platformName, platformRelease, platformVersion, platformMachine, platformCpu, platformMem, platformSwap, eventcount) 
 values ("30a81127-ed00-450f-a6a6-936eccd41006", "5.8", "diego_cell", "10.10.190.12", 0, "2190", "2016/10/08", "Linux", "4.3", "2014/1/2", "x86-64", 2, 8192, 1024, 0);

 
 insert into monit_process (process_id,processName,processStatus,status_message,collected_sec,collected_usec,processPid,processUptime,processChildren,processMemPercenttotal,processMemKilobytetotal,processCpuPercenttotal,monitId) 
 values (1,"java",1,"running","2016/06/06 20:08:43","124565",1458,"224532",0,0.21,124567,0.02,"02b2ae47-5ce4-401c-9682-02464ed90fe3");
 
 insert into monit_process (process_id,processName,processStatus,status_message,collected_sec,collected_usec,processPid,processUptime,processChildren,processMemPercenttotal,processMemKilobytetotal,processCpuPercenttotal,monitId) 
 values (2,"top",1,"running","2016/07/12 13:02:10","124165",6432,"122332",0,0.07,2278,0.10,"02b2ae47-5ce4-401c-9682-02464ed90fe3");