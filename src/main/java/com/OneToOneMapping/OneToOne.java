package com.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Question q1=new Question();
        q1.setQuestion_id(1);
        q1.setQuestion("What is java");
        Answer answer=new Answer();
        answer.setAnswer_id(101);
        answer.setAnswer("java is a programming language");
        q1.setAnswer(answer);
        answer.setQuestion(q1);
        session.save(q1);
        session.save(answer);      
        tx.commit();
        session.close();
        factory.close();
    }
}
