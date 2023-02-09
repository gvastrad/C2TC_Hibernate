package com.tnsif.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student2")
public class Student {
	@Column(name="studentid")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	@Column(name="studentname")
	private String studentName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressid")
	private Address address;
	
	public Student() {
	}

	public Student(int studentId, String studentName, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
}
