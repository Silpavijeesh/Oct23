package com.training.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class ReadWriteFileQ31 {

	public static void main(String[] args) throws IOException {
	String userDir=System.getProperty("user.dir");
    String fileseparator=System.getProperty("file.separator");
	String filepath=userDir+fileseparator+"Files"+fileseparator+"ReadFile.txt";
	FileReader ofilereader=new FileReader(filepath);		
	//read the file line by line.
	BufferedReader obufferedreader= new BufferedReader(ofilereader);		
	String userDir2=System.getProperty("user.dir");		
	String fileseparator2=System.getProperty("file.separator");
	String filepath2=userDir2+fileseparator2+"Files"+fileseparator2+"WriteFile.txt";		
	FileWriter ofilewriter=new FileWriter(filepath2);		
	BufferedWriter obufferedwriter= new BufferedWriter(ofilewriter);		
	Stack<String> stk=new Stack<String>();	
	String str;
	boolean b=true;
	while((str=obufferedreader.readLine())!=null) {
		stk.add(str);
	}
	do {		
		obufferedwriter.write(stk.pop()+"\n");	
		b=stk.isEmpty();
	} while(b==false);
	obufferedreader.close();
	obufferedwriter.close();
	}
			}		
			
			
			
	
	
	
	
	
	
	
	
	


