package com.sample.orm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sample.domain.Student;

public class StudentSpringDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate; 
	@Autowired
	private DataSource dataSource;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Student readStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> readStudent() {
		/*@SuppressWarnings({ "unchecked"})
		List<Student> students = (List<Student>) jdbcTemplate.queryForObject("Select * from Student", new RowMapper<Student>(){
			@Override
			public Student mapRow(final ResultSet rs, final int cnt) throws SQLException {
				final Student student = new Student();
				student.setStudentname(rs.getString("name"));
				student.setId(rs.getInt("id"));
				student.setAge(rs.getString("age"));
				return student;
			}
			
		});*/
		Student stu = new Student();
		stu.setAge("25"); stu.setId(1); stu.setStudentname("Shyam");
		List <Student> students = new ArrayList();
		students.add(stu);
		return students;
	}


	@Override
	public void setStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
