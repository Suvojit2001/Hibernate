package com.author;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Author a1=new Author();
		a1.setAuthor_id(1);
		a1.setAuthor_name("Satyajit Roy");
		Book b1=new Book();
		Book b2=new Book();
		b1.setBook_id(101);
		b1.setBook_name("Feluda somogro part 1");
		b2.setBook_id(102);
		b2.setBook_name("Feluda somogro part 2");
		List<Book> list =new ArrayList<>();
		list.add(b1);
		list.add(b2);
		a1.setBook(list);
		b1.setAuthor(a1);
		b2.setAuthor(a1);
		session.save(b2);
		session.save(b1);
		session.save(a1);
		tx.commit();
		session.close();
		factory.close();
		
		
		
		
		
	}
}
