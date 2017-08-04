package com.example.spring.transcation;

public class User {
	
	private String username;
	//存款
	private double deposit;
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(String username, double deposit) {
		super();
		this.username = username;
		this.deposit = deposit;
	}

}
