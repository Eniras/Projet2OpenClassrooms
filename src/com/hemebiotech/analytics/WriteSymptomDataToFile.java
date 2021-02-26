package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteSymptomDataToFile implements ISymptomWriter {
	String fileName;
	FileWriter writer;
	public WriteSymptomDataToFile(String fileName) throws IOException {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	
	this.writer= new FileWriter (fileName);
	
		
	}

	@Override
	
	public void writeSymptoms(String Symptoms, int SymptomsCount) throws IOException {
		// TODO Auto-generated method stub
		
					writer.write( Symptoms + SymptomsCount +"\n");
					
							}

	public void forClose() throws IOException {
		// TODO Auto-generated method stub
		writer.close();
	}
				}
	

	
	
