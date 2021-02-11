package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		// first get input
		 BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
				writer.write("headache: " + headacheCount + "\n");
				writer.write("rash: " + rashCount + "\n");
				writer.write("dialated pupils: " + pupilCount + "\n");
				writer.close();

	}

}
