package com.hql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL2 {
      public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
	    //Delete Query
/*	 Query query= session.createQuery("delete from Student  where city=:c");
		query.setParameter("c","kolkata");
		int r=query.executeUpdate();
		System.out.println(r+" value deleted ");          */
		
		
		//Update
/*		Query query=session.createQuery("update from Student set city=:c where city=:x");
		query.setParameter("c", "bangalore");
		query.setParameter("x", "kolkata");
		int r=query.executeUpdate();
		System.out.println(r+" rows updated");        */
		
		
		// how to execute join table
		Query query=session.createQuery("select q.question ,q.question_id,a.answer from Quest"
				+ "ion as q INNER JOIN q.answer as a ");
		List<Object []> list1= query.getResultList();
		for(Object [] arr:list1) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}
