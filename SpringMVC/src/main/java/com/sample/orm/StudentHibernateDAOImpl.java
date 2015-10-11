package com.sample.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sample.domain.Student;
//@Service
public class StudentHibernateDAOImpl extends HibernateDaoSupport implements StudentDAO{

	@Override
	public Student readStudent(Integer id) {
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate-annotation.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
//	    List<Student> students = session.createQuery("from Student").list();//Getting the object  
//	    List<Student> students = null;
	    Student student = new Student();
	    session.load(student, id);
	    /*for(Student student : students){
	    	
	    }*/
	    t.commit();//transaction is committed  
	    session.close();  
		return student;
		
	}
	
	@Override
	public List<Student> readStudent() {
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate-annotation.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    List<Student> students = session.createCriteria(Student.class).addOrder(Order.desc("id")).list();//Getting the object  
//	    List<Student> students = new ArrayList<Student>();
//	    Student student = new Student();
//	    session.save(students);
	    /*for(Student student : students){
	    	
	    }*/
	    t.commit();//transaction is committed  
	    session.close();  
		return students;
		
	}

	@Override
	public void setStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
}
