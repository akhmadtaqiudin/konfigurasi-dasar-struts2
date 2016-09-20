package com.id.taqi.app;

import com.opensymphony.xwork2.ActionSupport;

public class Pojo extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private final String sapa = "hello ";
	
	public String tampil(){
		setUsername(sapa + getUsername());
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
