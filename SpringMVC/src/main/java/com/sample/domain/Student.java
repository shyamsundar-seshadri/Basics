/**
 * 
 */
package com.sample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Shyam
 *
 */

@Entity
@Table(name="Student", 
       uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class Student {
	
	   @Column(name="age")
	   private String age;
	
	   @Column(name="name")
	   private String studentname;
	   
	   @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	    @Column(name="ID", nullable=false, unique=true, length=11)
		private Integer id;
		
	  public Student(){
		  
	  }
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


}
