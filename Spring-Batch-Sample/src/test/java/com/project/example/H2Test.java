package com.project.example;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/context/DataSourceContext.xml", "/context/BatchContext.xml", "/batchjob/BatchJob.xml"})
public class H2Test {
	
@Autowired
private JobLauncherTestUtils jobLauncherTestUtils;
	
//@Autowired
//private ApplicationContext context;

@Autowired
private DataSource dataSource;

@Test
	public void test() {
		try {
			JobExecution jobExecution = jobLauncherTestUtils.launchJob();
			System.out.println(jobExecution.getStatus());
			/*this.jdbcTemplate = new SimpleJdbcTemplate(dataSource);
			int i = jdbcTemplate.queryForInt("select count(*) from TestTb");
			System.out.println("initially " + i);
			jdbcTemplate.update("insert into TestTb values ('1','2','2','4')");
			int f = jdbcTemplate.queryForInt("select count(*) from TestTb");
			System.out.println("finally " + f);
			*/
		}catch (Exception e)
	{System.out.println(e);}
	}

}
