package com.hemebiotech.analytics;

import java.io.IOException;

public interface ISymptomWriter {

	void writeSymptoms(String headacheCount, String rashCount, String pupilCount) throws IOException;
}
