package com.sample.orm;

import java.util.List;

import com.sample.domain.Student;

public interface StudentDAO {
	public Student readStudent(Integer id) ;
	public List<Student> readStudent() ;
	public void setStudent(Student student);
}
