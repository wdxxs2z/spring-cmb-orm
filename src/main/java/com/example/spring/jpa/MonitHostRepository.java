package com.example.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.domain.MonitHost;

@Repository("monitHostRepository")
public interface MonitHostRepository extends PagingAndSortingRepository<MonitHost, Long>{
	
	Long deleteByMonitId(String monitId);
	
	MonitHost findByMonitId(String monitId);
	
	List<MonitHost> findByMonitVersionOrderByEventcountAsc(String monitVersion);
	
	List<MonitHost> findByMonitVersionAndPlatformCpu(String monitVersion, int platformCpu);
	
	List<MonitHost> findByMonitHostNameIgnoreCase(String monitHostName);

}
