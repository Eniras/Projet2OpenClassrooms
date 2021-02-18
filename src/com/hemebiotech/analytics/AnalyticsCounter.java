package com.hemebiotech.analytics;
import java.util.List;


public class AnalyticsCounter {


	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0

	// variable d'instance
	private ReadSymptomDataFromFile readSymptomDataFromFile;

	//public static void main(String args[]) throws Exception {

	// Constructeur
	public AnalyticsCounter(ReadSymptomDataFromFile readSymptomDataFromFile) {
		this.readSymptomDataFromFile = readSymptomDataFromFile;
	}


	
	
	public void Counter () {

		List<String> symptoms = readSymptomDataFromFile.GetSymptoms();
		for (String symptom : symptoms)
		{	
			if (symptom.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches :" + headacheCount);
			}
			else if (symptom.equals("rash")) {
				rashCount++;
				System.out.println("number of rash :" + rashCount);
			}
			else if (symptom.equals ("pupils")) {
				pupilCount++;
				System.out.println("number of pupil :" + pupilCount);
			}
		}
	}
}








