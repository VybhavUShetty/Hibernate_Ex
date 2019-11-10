package com.lti.HibernateCollegePro.CollegeMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="INSTRUCTOR")
public class Instructor {
	@Id
	@Column(name="INSTID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GEN3")
	@SequenceGenerator(name="GEN3",sequenceName="inst_seq",allocationSize=1)
	private int instid;
	
	@Column(name="INSTNAME")
	private String instname;
	
	@ManyToOne
	@JoinColumn(name="DEPTID")
	private Department department;
	
	
	
	public Instructor() {
		
	}

	public int getInstid() {
		return instid;
	}

	public void setInstid(int instid) {
		this.instid = instid;
	}

	public String getInstname() {
		return instname;
	}

	public void setInstname(String instname) {
		this.instname = instname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

	

	@Override
	public String toString() {
		return "Instructor [instid=" + instid + ", instname=" + instname + ", department=" + department + "]";
	}

	public Instructor(int instid, String instname, Department department) {
		super();
		this.instid = instid;
		this.instname = instname;
		this.department = department;
		
	}
	
	
	
	

}
