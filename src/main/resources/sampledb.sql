
DROP DATABASE IF EXISTS mydb;
CREATE DATABASE mydb DEFAULT CHARACTER SET utf8;
USE mydb;

/*==============================================================*/
/* Table: hosts ���������Ϣ��                                  */
/*==============================================================*/
drop table if exists monit_hosts;
create table monit_hosts
(
   monitId varchar(255) not null primary key,   /*Monit ID monit��Ψһ��ʾ*/
   monitVersion varchar(16),                    /*monit �İ汾*/
   monitHostName varchar(32),                   /*monit ��װ�˵�������*/
   monitHostIp varchar(42),                     /*monit ��װ�˵�IP*/
   monitHostStatus int,                         /*monit ��װ�˵�����״̬ 0����� 1��δ����*/
   monitHostPort varchar(6),                    /*monit ��װ�˵Ľ��ն˿�*/
   updateTime varchar(16),                      /*ϵͳ����ʱ��*/
   platformName varchar(20),                    /*ƽ̨��*/
   platformRelease varchar(255),                /*ƽ̨�ں˰汾*/
   platformVersion varchar(255),                /*ƽ̨�ں˱���ʱ��*/
   platformMachine varchar(255),                /*ƽ̨ϵͳ�ܹ�*/
   platformCpu int,                             /*ƽ̨CPU����*/
   platformMem int,                             /*ƽ̨�ڴ�ʹ��*/
   platformSwap int,                            /*ƽ̨������ʹ��*/
   eventcount int                               /*�¼�����*/
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: hosts ��������ڵĽ�����Ϣ��                          */
/*==============================================================*/
drop table if exists monit_process;
create table monit_process (
process_id INT(5) AUTO_INCREMENT NOT NULL primary key,
processName varchar(16),                     /*������*/
processStatus int,                           /*����״̬*/
status_message varchar(64),                  /*����״̬��Ϣ*/
collected_sec varchar(32),                   /*�ռ��������ݿ�ʼʱ��*/
collected_usec varchar(16),                  /*�ռ��������ݳ���ʱ��*/
processPid varchar(8),                       /*���̵�PID*/
processUptime varchar(16),                   /*��������ʱ��*/
processChildren int,                         /*���̵��ӽ�����*/
processMemPercenttotal numeric(4,1),         /*�����ڴ�ռ�ðٷֱ�*/
processMemKilobytetotal int,                 /*����ռ���ڴ��� KB*/
processCpuPercenttotal numeric(4,1),         /*����ռ��CPU�ٷֱ�*/
monitId varchar(255)                         /*����monit*/
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