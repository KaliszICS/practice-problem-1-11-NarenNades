/**
	* File: Lesson 1.11 - Math
	* Author: Naren Nades
	* Date Created: Feb 24, 2023
	* Date Last Modified: Mar 3, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = s.nextDouble();

		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = s.nextDouble();
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();

		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = s.nextDouble();

		System.out.println(Math.round(Math.sqrt(num)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = s.nextDouble();
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();

		System.out.println(Math.pow(num1, num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = s.nextDouble();
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = s.nextDouble();

		System.out.println(Math.max(num1,(Math.max(num2, num3))));
		System.out.println(Math.min(num1,(Math.min(num2, num3))));
	}

}
