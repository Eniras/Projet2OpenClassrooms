package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) throws IOException {
		/**
		I* Instanciation to read the symptoms in "symptoms.txt then count the words in the list and finally to write the result in "result.out"
		 * 
		 */
		
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		
		
		
		
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptomDataFromFile);
		TreeMap<String, Integer> Count= analyticsCounter.Counter();
		
		
		
		
		
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
		
		
		for (Entry<String, Integer> entry : Count.entrySet())
		{
			writeSymptomDataToFile.writeSymptoms(entry.getKey(), entry.getValue());	
		}
		writeSymptomDataToFile.forClose();
		
	} 
		
		
	}

