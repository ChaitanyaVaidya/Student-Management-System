package com.example.sms.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="teachers")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tId;
	
	@Column(name="t_Name")
	private String tName;
	@Column(name="t_Email")
	private String tEmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	 private List<Student> student;
	
	public Teacher(){
		
	}
	
	
	public Teacher(String tName, String tEmail, List<Student> student) {
		super();
		this.tName = tName;
		this.tEmail = tEmail;
		this.student = student;
	}


	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettEame() {
		return tName;
	}
	public void settEame(String tName) {
		this.tName = tName;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tEame=" + tName + ", tEmail=" + tEmail + "]";
	}
	
	
	

}
