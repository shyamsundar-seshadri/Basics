package com.project.writer;

import java.util.List;


import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

@SuppressWarnings("deprecation")
public class BatchDBWriter extends JdbcBatchItemWriter<Object>{

	private NamedParameterJdbcOperations namedParameterJdbcTemplate;

	@Override
	public void write(List<? extends Object> arg0) throws Exception {
		SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(this.namedParameterJdbcTemplate) ;
		int i = jdbcTemplate.queryForInt("Select count(*) from TestTb");
		System.out.println("hi "+i);
	}
	
	@Override
	public void setJdbcTemplate(NamedParameterJdbcOperations namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
//	@Override
//	public void setItemSqlParameterSourceProvider(
//			ItemSqlParameterSourceProvider<Object> itemSqlParameterSourceProvider) {
//		// TODO Auto-generated method stub
//		this.setItemSqlParameterSourceProvider(itemSqlParameterSourceProvider);
//		
//	}

}
