/**
 * 
 */
package com.project.reader;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author Shyam
 *
 */
public class GenericDBMapper implements RowMapper <List<Object>>{

	@Override
	public List<Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
		List <Object> objList = new ArrayList<Object>();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		for (int i=1;i<=columnsNumber;i++){
			objList.add(rs.getObject(i));
		}
		return objList;
	}


}
