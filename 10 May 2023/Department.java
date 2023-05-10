package com.hibernateonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department 
{
	@Id
	private int did;
	private String Dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}

}
