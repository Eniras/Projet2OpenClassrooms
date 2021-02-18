package com.hemebiotech.analytics;

import java.io.IOException;

public interface ISymptomWriter {
	/**
		Symptoms are written in a new file
	 */
	public void writeSymptoms(String headacheCount, String rashCount, String pupilCount) throws IOException;
}
