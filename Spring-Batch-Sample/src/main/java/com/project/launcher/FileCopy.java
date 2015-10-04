package com.project.launcher;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.util.LaunchUtils;

public class FileCopy {

	private static ApplicationContext context;
	private final static String OUTPUT_FILE_NAME = "outputEmp.csv";

	/**
	 * @param args
	 */
	@Autowired
	public static void main(String[] args) {
		long starttime = new Date().getTime();
		String[] springConfig = { "/batchjob/fileToFileJob.xml" };
		Log log = LogFactory.getLog(FileCopy.class);
		context = new ClassPathXmlApplicationContext(springConfig);
		log.debug("Starting FileCopy at " + starttime);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("BatchJob1");

		try {
			JobParameters jobParameter = new JobParametersBuilder()
			.addString(LaunchUtils.OUTPUT_FILE_NAME_KEY,"file:" + LaunchUtils.OUTPUT_FILE_LOC + OUTPUT_FILE_NAME)
			.addString(LaunchUtils.OUTPUT_DELIMITER_KEY, LaunchUtils.COMMA_DELIMITER)
			.addString(LaunchUtils.SQL_QUERY_KEY, "select * from Employee")
					.toJobParameters();
			JobExecution execution = jobLauncher.run(job, jobParameter);
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			log.error(e);
		}

	}

}
