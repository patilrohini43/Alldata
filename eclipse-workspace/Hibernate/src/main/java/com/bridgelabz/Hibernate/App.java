package com.bridgelabz.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fruits fruit=new Fruits();
        fruit.setId("2");
        fruit.setName("Mango");
        fruit.setQty("2kg");
        
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Fruits.class);
        
        
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        		
        		
        SessionFactory sf=con.buildSessionFactory(sr);
        
        Session session=sf.openSession();
        
        Transaction transaction=session.beginTransaction();
        session.save(fruit);
        transaction.commit();
    }
}
