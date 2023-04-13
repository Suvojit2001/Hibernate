package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.states.Student;

public class pagination {
		public static void main(String[] args) {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery("from Student");
			// implementing pagination using hibernate 
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<Student> list=query.list();
			for(Student st:list) {
				System.out.println(st.getStudentId()+ "   "+st.getStudentName());
			}
			
			
			
			tx.commit();
			session.close();
			factory.close();
		}
}
