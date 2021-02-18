package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		/**
		I* Instanciation to read the symptoms in "symptoms.txt then count the words in the list and finally to write the result in "result.out"
		 * 
		 */
		
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		
		
		
		
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptomDataFromFile);
		analyticsCounter.Counter();
		
		
		
		
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
		
		
		
		
		
		
	}

}
