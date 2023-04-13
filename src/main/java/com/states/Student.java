package com.states;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + ", cirtificate="
				+ cirtificate + "]";
	}
	@Id
   int studentId;
   String studentName;
   String city;
   Cirtificate cirtificate;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Cirtificate getCirtificate() {
	return cirtificate;
}
public void setCirtificate(Cirtificate cirtificate) {
	this.cirtificate = cirtificate;
}
public Student(int studentId, String studentName, String city, Cirtificate cirtificate) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.city = city;
	this.cirtificate = cirtificate;
}
public Student() {
	super();
	
}
   
}
