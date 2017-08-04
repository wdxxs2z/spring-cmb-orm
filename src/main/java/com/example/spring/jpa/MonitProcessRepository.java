package com.example.spring.jpa;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.spring.domain.MonitProcess;

public interface MonitProcessRepository extends PagingAndSortingRepository<MonitProcess, Long> {
	
	List<MonitProcess> findByMonitId(String monitId);

	List<MonitProcess> findByMonitId(String monitId, Sort sort);

	List<MonitProcess> findByMonitId(String monitId, Pageable pageable);
	
	//直接返回Page对象
	//Page<MonitProcess> findByMonitId(String monitId, Pageable pageable);
	
	/**
	 * ManyToOne processes -> monitHost 
	 * 多对一的关系
	 * */
	@Query("select monitProcess from MonitProcess monitProcess join monitProcess.host host where host.monitId = ?1")
	List<MonitProcess> findSelfMonitId(String monitId, Pageable pageable);
	
	Long deleteByMonitId(String monitId);
}
