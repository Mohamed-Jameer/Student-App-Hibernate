package com.hib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	@Column(name="mobile")
	private String mobile;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
	// BI Direction
	@OneToOne(mappedBy = "studentDetails", cascade = CascadeType.ALL)
	private StudentDemo student;
	
	
	public StudentDemo getStudent() {
		return student;
	}
	public void setStudent(StudentDemo student) {
		this.student = student;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StudentDetails(int sid, String mobile, String city, String state) {
		super();
		this.sid = sid;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}
	public StudentDetails(String mobile, String city, String state) {
		super();
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", mobile=" + mobile + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
