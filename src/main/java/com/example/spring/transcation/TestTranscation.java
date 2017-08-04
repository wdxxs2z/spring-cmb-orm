package com.example.spring.transcation;

import javax.transaction.TransactionManager;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class TestTranscation {
	
	public void Test(){
		int isolationDefault = TransactionDefinition.ISOLATION_DEFAULT;
		
		PlatformTransactionManager ptm = new PlatformTransactionManager() {
			
			@Override
			public void rollback(TransactionStatus status) throws TransactionException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void commit(TransactionStatus status) throws TransactionException {
				// TODO Auto-generated method stub
				
			}
		};
		
		JpaTransactionManager jtm = new JpaTransactionManager();
		
		DataSourceTransactionManager dtm = new DataSourceTransactionManager();
		
		HibernateTransactionManager htm = new HibernateTransactionManager();
		
		
		
		
		
	}

}
