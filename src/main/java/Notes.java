/**
	* File: Lesson 1.11 - Math
	* Author: Mr. Kalisz
	* Date Created: Feb 24, 2023
	* Date Last Modified: Mar 3, 2026
	*/

class Notes {
	public static void main(String args[]) {

		//Math functions - Just like our string methods, they create copies and do not alter the originals

		//Math.abs(value) - absolute value - creates a positive version of your numbers.  Positive stay the same, negatives become positive

		// System.out.println(Math.abs(7));
		// System.out.println(Math.abs(-4));
		// System.out.println(Math.abs(4.5));

		// int num;
		// num = -5;
		// System.out.println(Math.abs(num));
		// System.out.println(num);

		//Math.floor(value) - round down (lower) to the nearest whole number

		// System.out.println(Math.floor(3.5));
		// System.out.println(Math.floor(-3.5));

		//Math.ceil(value) - round up (higher) to the nearest whole number

		// System.out.println(Math.ceil(3.5));
		// System.out.println(Math.ceil(-3.5));

		//Math.max(value, value) - gets going to the maximum (greater) value

		// System.out.println(Math.max(3, 5)); //5
		// System.out.println(Math.max(-3, -5)); //-3

		//Math.min(value, value) - returns the minimum (lesser) of the two numbers

		// System.out.println(Math.min(3, 5)); //3
		// System.out.println(Math.min(-3, -5)); //-5

		//Math.pow(value, expo) - value to the power of expo

		//gives a double
		System.out.println(Math.pow(5, 2)); //5 ^ 2
		System.out.println(Math.pow(5, 3)); //5 ^ 3

		//Math.round(value) - rounds the number to the nears whole number
		//.5 and up -> round up.
		// < .5 		-> round down

		// System.out.println(Math.round(3.5));
		// System.out.println(Math.round(3.4));

		//Math.sqrt(value)

		// System.out.println(Math.sqrt(4));
		// System.out.println(Math.sqrt(6));

		//all math functions available at https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
	}
}