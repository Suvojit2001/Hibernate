package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StatesDemo {
		public static void main(String[] args) {
			//Practical of Hibernate States
			//Transient
			//Persistent
			//Detached
			//Removed
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Student s1=new Student();
			s1.setStudentId(110);
			s1.setStudentName("Durgesh");
			s1.setCity("Kolkata");
			s1.setCirtificate(new Cirtificate("Java ","3 month"));
			// student : Transient state
			Session session=factory.openSession();
			session.save(s1);
			Transaction tx=session.beginTransaction();
			// student: persistent state
			//s1.setStudentName("John");  //if you see in database you will see name is john,
			//but how this is possible, in line 23, you have save s1 with name durgesh 
			tx.commit();
			factory.close();
			session.close();
			//student : Detached state
			s1.setStudentName("Sachin"); //now session is closed so if you set name now ,
			//this will not reflect in your Db
		}
}
