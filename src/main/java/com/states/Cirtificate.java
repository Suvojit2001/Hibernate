package com.states;

import javax.persistence.Embeddable;

@Embeddable
public class Cirtificate {
   @Override
	public String toString() {
		return "Cirtificate [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}
String courseName;
   String courseDuration;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(String courseDuration) {
	this.courseDuration = courseDuration;
}
public Cirtificate(String courseName, String courseDuration) {
	super();
	this.courseName = courseName;
	this.courseDuration = courseDuration;
}
public Cirtificate() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
