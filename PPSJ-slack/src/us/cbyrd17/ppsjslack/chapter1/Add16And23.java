/**
 * Listing 1.1: This Java program finds the sum of 16 and 23, and
 * then displays the result.
 */
package us.cbyrd17.ppsjslack.chapter1;

import java.util.logging.Logger;

/**
 * @author CByrd17
 *
 */
public final class Add16And23 {

	private static final int TWENTY_THREE = 23;
	private static final int SIXTEEN = 16;

	/**
	 * No public constructor.
	 */
	private Add16And23() {

	}

	/**
	 * @param args
	 *            a variable number of Strings that are passed by the JVM to
	 *            this method.
	 */
	public static void main(String... args) {

		final Logger log = Logger.getLogger(Add16And23.class.getName());

		int sum;

		sum = SIXTEEN + TWENTY_THREE;
		log.info("The sum of 16 and 23 is " + sum);
	}
}
