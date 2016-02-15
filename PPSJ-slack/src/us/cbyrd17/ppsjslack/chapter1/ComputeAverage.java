/**
 * Listing 1.2 & 1.3: This program displays the average of a series of
 * numbers terminated by zero. The user enters the numbers using
 * the keyboard, and the average is displayed on the screen.
 */
package us.cbyrd17.ppsjslack.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Logger;

/**
 * @author CByrd17
 *
 */
public final class ComputeAverage {

	/**
	 * No public constructor.
	 */
	private ComputeAverage() {

	}

	/**
	 * @param args
	 *            a variable number of Strings that are passed by the JVM to
	 *            this method.
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws ParseException
	 *             if the beginning of the specified string of numbers to
	 *             average cannot be parsed.
	 */
	public static void main(String... args)
			throws ParseException, IOException {
		final Logger log = Logger.getLogger(ComputeAverage.class.getName());

		double inputValue; // Last value read from the user
		double runningTotal; // Total of all input values read so far
		int runningCount; // Count of all input values read so far
		double average; // Average of input values

		// Create an input stream and attach it to the standard
		// input stream
		BufferedReader inStream = new BufferedReader(
				new InputStreamReader(System.in));

		// Create a number formatter object
		NumberFormat formatter = NumberFormat.getInstance();

		// Display the program title
		log.info("---Compute Average---");

		// Set running total to 0
		runningTotal = 0;

		// Set running count to 0
		runningCount = 0;

		// Read the first input value
		log.info("Enter a value (0 to stop): ");
		inputValue = formatter.parse(inStream.readLine()).doubleValue();

		// Keep reading until 0
		while (Double.compare(inputValue, 0) != 0) {
			// Add value to running total
			runningTotal = runningTotal + inputValue;

			// Add 1 to running count; // NOSONAR
			runningCount = runningCount + 1;

			// Read the next input value
			log.info("Enter a value (0 to stop): ");
			inputValue = formatter.parse(inStream.readLine()).doubleValue();
		}
		if (runningCount > 0) {
			// Compute the average
			average = runningTotal / runningCount;

			// Display the average
			log.info("The average is " + average);
		} else {
			log.info("Can't compute average: No input values");
		}

	}
}
