package com.hib.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentDemo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname; 
	
	@Column(name="email")
	private String email ;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pincode")
	private int pincode;
	
	// UNI Direction
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentdetailid")
	private StudentDetails studentDetails;
	
	
	// One TO Many
	@OneToMany(mappedBy ="student" , cascade = CascadeType.ALL)
	private List<Subject> subject;
	
	//Many To Many
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_project", joinColumns= {@JoinColumn(name="sid")}
	, inverseJoinColumns = {@JoinColumn(name="pid")} )
	private List<Project> projectList;
	
	public List<Subject> getSubject() {
		return subject;
	}
	
	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDemo(int sid, String sname, String email, String address, int pincode) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
	}
	public StudentDemo(String sname, String email, String address, int pincode) {
		super();
		this.sname = sname;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "StudentDemo [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address
				+ ", pincode=" + pincode + ", studentDetails=" + studentDetails + "]";
	}
	
	
	

}
