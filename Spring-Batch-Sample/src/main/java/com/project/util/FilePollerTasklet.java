package com.project.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;


public class FilePollerTasklet implements Tasklet, InitializingBean{
	private static transient Log log=LogFactory.getLog(FilePollerTasklet.class);
	private String resource;

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {
		int i=0;
		List<Long> size = new ArrayList<Long>() ;
		File file= new File(this.resource);
		while (true){
			try
			{
				if (file.exists()) {
					size.add((Long) file.length());
					if (!(i == 0)) {
						if (size.get(i).equals(size.get(i - 1))) {
							log.info("Whole file is received");
							if (file.length()==0){
								log.info("File is Zero Byte");
								System.exit(1);
							}
							break;
						}
					}
					log.info("File found . Checking whole file is received");
					Thread.sleep(1000);
				} else {
					System.out.println("Polling for file");
					Thread.sleep(500);
					if (i < 5) {
						log.debug("File polling time out exiting . . ");
						System.exit(1);
					}
				}

			}
			catch(InterruptedException e){
				log.trace(e);
			}
			catch(Exception e){
				log.trace(e);
			}
			++i;	
		}
		return null;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
