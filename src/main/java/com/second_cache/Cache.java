package com.second_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.states.Student;


public class Cache {
		public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
	Session session=factory.openSession();
	//in student class you have to use @Cacheable
	//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY) for 2nd level cache
	Student student = session.get(Student.class, 110);
	System.out.println(student);
	session.close();		// here closed the session 
	
	System.out.println("Working on something ");
			
	Session session1=factory.openSession();
	Student student1 = session1.get(Student.class, 110);
	System.out.println(student1);
	System.out.println(session1.contains(student1));  // after session closed , 
	//object is still in cache memory
	session.close();
	factory.close();
			}
	

		}

