package com.sample.orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionAnnotationFactory;
	
	 private static SessionFactory buildSessionAnnotationFactory() {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            Configuration configuration = new Configuration();
	            configuration.configure("hibernate-annotation.cfg.xml");
	            System.out.println("Hibernate Annotation Configuration loaded");
	             
//	            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	            System.out.println("Hibernate Annotation serviceRegistry created");
	             
//	            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	             
	            return null;
	        }
	        catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
}
