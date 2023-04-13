package com.first_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.states.Student;

public class Cache {
		public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session=factory.openSession();
		Student student = session.get(Student.class, 110);
		System.out.println(student);
			
		System.out.println("Working on something ");
			
		Student student1 = session.get(Student.class, 110);
		System.out.println(student1);
		//Here hibernate do not run hit DB for same object ,i.e it will not
		//fire query 2nd time, this is 1st level cache
		System.out.println(session.contains(student1));//is student1 avalaible in cache?
			
		session.close();
		factory.close();
		}
}
