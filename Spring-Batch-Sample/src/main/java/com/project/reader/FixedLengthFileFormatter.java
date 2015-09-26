package com.project.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.Range;

public class FixedLengthFileFormatter extends FixedLengthTokenizer {
	private static transient Log log=LogFactory.getLog(FixedLengthFileFormatter.class);
	static String filename="C:/Users/Shyam/Documents/workspace-sts-3.2.0.RELEASE/Sample/src/main/resources/data/format.dat";
	static File file=new File(filename);
	static BufferedReader bfread= null;
    List<String> columnNameList=new ArrayList<String>();
	static List<Range> columnRangeList=new ArrayList<Range>();
	
	public FixedLengthFileFormatter(){
	try{
		System.out.println("Inside Line tokeniser");
		String line;
		int i=0;
		bfread=new BufferedReader(new FileReader(file));
		while ((line =bfread.readLine()) != null){
			System.out.println(line);
			String format[]=line.split(",");
			columnNameList.add(format[0]);
			String range[]=format[1].split("-");
			int startRange=Integer.parseInt(range[0]);
			int endRange=Integer.parseInt(range[1]);
			Range columnLineRange = new Range(startRange, endRange);
			columnRangeList.add(columnLineRange);
			i++;
		}
		String[] columnNames= columnNameList.toArray(new String[i]);
		setNames(columnNames);
		Range[] columnRanges= columnRangeList.toArray(new Range[i]);
		setColumns(columnRanges);	
		setStrict(false);
	}catch (IOException e) {
		e.printStackTrace();
		log.error(e);}

	}
	

	public void setFilename(String filename) {
		//this.file=new File(filename);
		//this.file = file;
	}
}
