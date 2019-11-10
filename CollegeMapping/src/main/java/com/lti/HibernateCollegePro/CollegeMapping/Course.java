
package com.lti.HibernateCollegePro.CollegeMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
@Column(name="COURSEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GEN4")
	@SequenceGenerator(name="GEN4",sequenceName="course_seq",allocationSize=1)
	private int courseid;
	
	@Column(name="COURSENAME")
	private String coursename;
	
	@ManyToOne
	@JoinColumn(name="DEPTID")
	private Department department;
	
	
	public Course() {
		
	}
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", department=" + department + "]";
	}
	public Course(int courseid, String coursename, Department department) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.department = department;
		
	}
	
	
	

}
