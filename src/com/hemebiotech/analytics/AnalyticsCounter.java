package com.hemebiotech.analytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


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
		HashMap<String,Integer> numberBySymptom = new HashMap<>();
		for (String symptom : symptoms)
		{	
			if (symptom.equals("headache")) {
				boolean isHeadacheExist=numberBySymptom.containsKey("headache");
				if (isHeadacheExist) {
					Integer headacheCount= numberBySymptom.get("headache");
					headacheCount ++;

					numberBySymptom.replace("headache", headacheCount);
				}
				else { 
					numberBySymptom.put ("headache", 0);
				}

				headacheCount++;
				System.out.println("number of headaches :" + headacheCount);
			}
			else if (symptom.equals("rash")) {
				boolean isRashExist = numberBySymptom.containsKey("rash");
				if (isRashExist) {
					Integer rashCount = numberBySymptom.get("rash");
					rashCount ++;
					numberBySymptom.replace("rash", rashCount);
				}
				else {
					numberBySymptom.put ("rash", 0);	
				}


				rashCount++;
				System.out.println("number of rash :" + rashCount);
			}
			else if (symptom.equals ("pupils")) {
				boolean isPupilExist = numberBySymptom.containsKey("pupil");
				if (isPupilExist) {
					Integer pupilCount = numberBySymptom.get("pupil");
					pupilCount ++;
					numberBySymptom.replace("pupil", pupilCount);
				}
				else {
					numberBySymptom.put ("pupil", 0);
				}

				pupilCount++;
				System.out.println("number of pupil :" + pupilCount);
			}
		}
		
		for (Entry<String, Integer> entry : numberBySymptom.entrySet())
		{
			System.out.println("For symptom "+ entry.getKey()+ " number of " + entry.getValue());	
		}
	}

}








