package com.lti.HibernateCollegePro.CollegeMapping;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="DEPARTMENT")
public class Department {
	@Id
	@Column(name="DEPTID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GEN1")
	@SequenceGenerator(name="GEN1",sequenceName="dept_seq",allocationSize=1)
	
	private int deptid;
	
	

	

	public void setInstructor(List<Instructor> instructor) {
		this.instructor = instructor;
	}

	@Column(name="DEPTNAME")
	private String deptname;
	

	@Column(name="INSTID")
	@OneToMany(targetEntity=Instructor.class,mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Instructor> instructor;
	
	@Column(name="STUDENTNAME")
	@OneToMany(targetEntity=Student.class,mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Student> students;
	
	
	@OneToOne(targetEntity=Course.class,mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Course> course;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Department() {
		
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	public List<Instructor> getInstructor() {
		return instructor;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", instructor=" + instructor + ", students="
				+ students + ", course=" + course + "]";
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Department(int deptid, String deptname, List<Instructor> instructor, List<Student> students,
			List<Course> course) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.instructor = instructor;
		this.students = students;
		this.course = course;
	}

	


	

	

	
	
	
	

}
