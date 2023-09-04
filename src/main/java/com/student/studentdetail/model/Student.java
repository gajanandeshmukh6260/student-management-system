package com.student.studentdetail.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Student_Name") 
	private String studentName;
	@Column(name="Mobile_Number") 
	private String mobileNumber;
	@Column(name="Mail_Id")
	private String mailId;
	
	public int getId() {
		return id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
