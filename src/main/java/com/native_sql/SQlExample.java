package com.native_sql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.states.Student;

public class SQlExample {
   public static void main(String[] args) {
	   SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		String string="select * from student";
		NativeQuery nq = session.createSQLQuery(string);
		List<Object []> list=nq.list();
		for(Object [] st:list) {
			System.out.println(Arrays.toString(st));
		}
		
		
		
		tx.commit();
		session.close();
		factory.close();
}
}
