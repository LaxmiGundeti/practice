package com.hibernateonetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee2 
{
	@Id @Column(name="Employee_Id")
	private int eid;
	@Column(name="Employee_Name")
	private String ename;
	@ManyToOne
	private Project1 proj;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Project1 getProj() {
		return proj;
	}
	public void setProj(Project1 proj) {
		this.proj = proj;
	}
	

}
