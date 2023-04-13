package com.hql;

import java.util.List;
import java.util.Scanner;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.states.Student;

public class HQL1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		// HQl
		// Syntax
		/*
		 * String query="from Student";
		 *  Query q=session.createQuery(query); 
		 * Student student= (Student) q.uniqueResult();
		 * System.out.println(student.getStudentName());
		 */
//			List<Student> list=q.list();

//			for(Student s:list) {
//				System.out.println(s.getStudentName()+"  "+s.getCity());
//			}      

		/*
		 * String query="from Student where city='kolkata'"; 
		 * Query query2=session.createQuery(query); 
		 * Student student=(Student)query2.uniqueResult();
		 * System.out.println(student.getStudentName()+" : "+student.getCirtificate().
		 * getCourseName());
		 */

		Scanner scanner = new Scanner(System.in);
		String query = "from Student where city=:x";
		Query query2 = session.createQuery(query);
		System.out.println("Enter yout city : ");
		String city = scanner.nextLine();
		query2.setParameter("x", city);
		Student student = (Student) query2.uniqueResult();
		System.out.println(student.getStudentName() + " : " + student.getCirtificate().getCourseName());
		session.close();
		factory.close();
	}
}
