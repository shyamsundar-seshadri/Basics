package com.project.launcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilePoller {

	/**
	 * Sample Plain Java program to check File Polling
	 * @author Shyam 
	 * 
	 */
	public static void main(String[] args) {
		int i=0;
		List<Long> size = new ArrayList<Long>() ;
		File file= new File("C:/Users/Shyam/Documents/workspace-sts-3.2.0.RELEASE/Sample/src/main/resources/data/report.dat");
		while (true){
			try
			{
				if (file.exists()) {
					Thread.sleep(500);
					size.add((Long) file.length());
					if (!(i == 0)) {
						if (size.get(i).equals(size.get(i - 1))) {
							System.out.println("Full File is received");
							break;
						}
					}
					System.out
							.println("File found . Checking full file is received");
				} else {
					System.out.println("Polling for file");
					Thread.sleep(500);
					if (i < 5) {
						continue;
					} else {
						System.out.println("File polling time out");

					}
				}

			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			catch(Exception e){
				System.out.println(e);
			}
			i++;	
		}

	}

}
