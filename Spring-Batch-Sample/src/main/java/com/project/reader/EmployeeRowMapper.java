/**
 * 
 */
package com.project.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.domain.Employee;

/**
 * @author Shyam
 *
 */
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp = new Employee();
		emp.setName(rs.getString(1));
		emp.setId(rs.getString(2));
		emp.setAge(rs.getString(3));
		return emp;
	}

}
