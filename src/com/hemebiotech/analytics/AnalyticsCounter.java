package com.hemebiotech.analytics;
import java.util.List;


public class AnalyticsCounter {


	private static int headacheCount = 0;	//nombre de symptome : mal de tête
	private static int rashCount = 0;		// nombre de symptome : eruption
	private static int pupilCount = 0;	    // nombre de symptome : pupille 
	
	
	
	private ReadSymptomDataFromFile readSymptomDataFromFile; // read Symptoms from file 



	// Constructor
	public AnalyticsCounter(ReadSymptomDataFromFile readSymptomDataFromFile) {
		this.readSymptomDataFromFile = readSymptomDataFromFile;
	}


	/**
	 * Counter allows you to browse the list and add 1 each time you find the desired symptom
	 */
	
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








