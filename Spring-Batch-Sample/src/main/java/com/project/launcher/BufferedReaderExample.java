package com.project.launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.file.transform.Range;


public class BufferedReaderExample {
	static String filename="C:/Users/Shyam/Documents/workspace-sts-3.2.0.RELEASE/Sample/src/main/resources/data/format.dat";
	static File file=new File(filename);
	static BufferedReader bfread= null;
    static List<String> columnNameList=new ArrayList<String>();
	static List<Range> columnRangeList=new ArrayList<Range>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String line;
			int i=0;
			bfread=new BufferedReader(new FileReader(file));
			while ((line =bfread.readLine()) != null){
				System.out.println(line);
				String format[]=line.split(",");
				columnNameList.add(format[0]);
				System.out.println(columnNameList);
				String range[]=format[1].split("-");
				int startRange=Integer.parseInt(range[0]);
				int endRange=Integer.parseInt(range[1]);
				Range columnLineRange = new Range(startRange, endRange);
				columnRangeList.add(columnLineRange);
				System.out.println("Col range is "+columnRangeList);
				i++;
			}
			String[] columnNames= columnNameList.toArray(new String[i-1]);
			System.out.println(columnNames);
			Range[] columnRanges= columnRangeList.toArray(new Range[i-1]);
			System.out.println(columnRanges.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
 
	}
	



