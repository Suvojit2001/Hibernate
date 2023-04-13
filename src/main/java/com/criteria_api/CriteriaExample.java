package com.criteria_api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.states.Student;

public class CriteriaExample {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
						.buildSessionFactory();
		Session session=factory.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("id",105));
		criteria.add(Restrictions.like("cirtificate.courseName", "Java%"));
		List<Student> list=criteria.list();
		for(Student st:list) {
			System.out.println(st);
		}
		session.close();
		factory.close();
				}
		

			}


