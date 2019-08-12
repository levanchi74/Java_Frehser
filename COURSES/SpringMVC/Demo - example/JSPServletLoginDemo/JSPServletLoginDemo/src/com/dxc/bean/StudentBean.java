package com.dxc.bean;

import java.io.Serializable;

public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	
	public StudentBean() {
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	
	
}
