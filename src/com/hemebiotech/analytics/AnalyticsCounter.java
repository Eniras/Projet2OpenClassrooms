package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;


public class AnalyticsCounter {


	/* 
	private static int headacheCount = 0;	//nombre de symptome : mal de tête
	private static int rashCount = 0;		// nombre de symptome : eruption
	private static int pupilCount = 0;	    // nombre de symptome : pupille 
	 */
	

	private ReadSymptomDataFromFile readSymptomDataFromFile; // read Symptoms from file 



	// Constructor
	public AnalyticsCounter(ReadSymptomDataFromFile readSymptomDataFromFile) {
		this.readSymptomDataFromFile = readSymptomDataFromFile;
	}


	/**
	 * Counter allows you to browse the list and add 1 each time you find the desired symptom
	 * @return 
	 */

	public TreeMap<String, Integer> Counter () {

		List<String> symptoms = readSymptomDataFromFile.GetSymptoms();
		TreeMap<String,Integer> numberBySymptom = new TreeMap<>();
		for (String symptom : symptoms)
		{	
			/* if (symptom.equals("headache")) {*/
				boolean isSymptomExist=numberBySymptom.containsKey(symptom);
				
				if (isSymptomExist) {
					Integer SymptomCount= numberBySymptom.get(symptom);
					SymptomCount ++;

					numberBySymptom.replace(symptom, SymptomCount);
				}
				else { 
					numberBySymptom.put (symptom, 0);
				}

				
			}
			/* else if (symptom.equals("rash")) {
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
		}*/
		
		for (Entry<String, Integer> entry : numberBySymptom.entrySet())
		{
			System.out.println("For symptom "+ entry.getKey()+ " number of " + entry.getValue());	
		}
		
		return numberBySymptom;
	} 

}








