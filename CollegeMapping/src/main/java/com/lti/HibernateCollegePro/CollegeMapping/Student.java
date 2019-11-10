package com.lti.HibernateCollegePro.CollegeMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@Column(name="STUDENTID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GEN")
	@SequenceGenerator(name="GEN",sequenceName="stud_seq1",allocationSize=1)
	private int studentid;
	
	@Column(name="STUDENTNAME")
	private String studentname;
	
	@ManyToOne
	@JoinColumn(name="DEPTID")
	private Department department;
	
	public Student() {
		
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", department=" + department + "]";
	}

	public Student(int studentid, String studentname, Department department) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.department = department;
	}
	
	
	
	
	
	

}
