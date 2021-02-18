package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		
		// Instanciation reader data fromfile
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		
		
		
		// Instanciation Analytic counter
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptomDataFromFile);
		analyticsCounter.Counter();
		
		
		// Instanciation Writter data from file
		
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
		
		
		
		
		
		
	}

}
