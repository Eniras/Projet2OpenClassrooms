package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;


public class WriteSymptomDataToFile implements ISymptomWriter {
	String fileName;

	public WriteSymptomDataToFile(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	
	
	
		
	}

	@Override
	
	public void writeSymptoms(String headacheCount, String rashCount, String pupilCount) throws IOException {
		// TODO Auto-generated method stub
					FileWriter writer = new FileWriter (fileName);
					writer.write("headache: " + headacheCount + "\n");
					writer.write("rash: " + rashCount + "\n");
					writer.write("dialated pupils: " + pupilCount + "\n");
					writer.close();
				}
	}

	
	
