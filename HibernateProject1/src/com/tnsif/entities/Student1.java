package com.tnsif.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student1 {

	@Id
	private int sid;
	
	private String sname;
	public Student1() {
		
	}
	
	public Student1(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	}

	
}