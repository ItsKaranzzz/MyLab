package com.util.app;

import java.util.Scanner;

public class NumberToWordConversionApp {

	private static String onesDigit[] = { "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine" };
	private static String tensDigit[] = { "Eleven", "Twelve", "Thirteen",
			"Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static String tensMultiple[] = { "Ten", "Twenty", "Thirty",
			"Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
	private static String hundreds[] = { "Hundred" };

	public static void main(String[] args) {

		numToWordConversionStandaloneApp();
	}

	@SuppressWarnings("resource")
	public static void numToWordConversionStandaloneApp() {
		Scanner readFromUser = null;
		int number;
		try {
			do {
				System.out.println("Enter any number between 1 to 999");

				readFromUser = new Scanner(System.in);
				try {
					number = readFromUser.nextInt();
				} catch (Exception e) {
					throw new Exception(
							"Inavlid Number: Please Enter Integer Only");
				}

				if ((number > 0) && (number <= 100))
					System.out.println(convertNumberLessThanOrHundred(number));
				else if ((number > 100) && (number <= 999))
					System.out.println(convertNumberGreaterthanHundred(number));
				else if (number > 999) {
					throw new Exception(
							"Invalid Number:Please Enter Number within specified Range");
				}
			} while (number != 0);
			System.out.println("You have been Exited Sucessfully !!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String convertNumberGreaterthanHundred(int number) {
		int r = number % 100;
		int t = number / 100;

		if (convertNumberLessThanOrHundred(r) != null)
			return (onesDigit[t - 1] + " " + hundreds[0] + " " + convertNumberLessThanOrHundred(r));
		else
			return (onesDigit[t - 1] + " " + hundreds[0]);

	}

	public static String convertNumberLessThanOrHundred(int number) {
		if ((number < 10) && (number > 0))
			return (onesDigit[number - 1]);
		else if ((number > 20) && (number < 100) && (number != 20)
				&& (number != 30) && (number != 40) && (number != 50)
				&& (number != 60) && (number != 70) && (number != 80)
				&& (number != 90)) {
			int r = number % 10;
			number = number / 10;
			return (tensMultiple[number - 1] + " " + onesDigit[r - 1]);
		} else if ((number > 10) && (number < 20)) {
			number = number % 10;
			return (tensDigit[number - 1]);
		}

		else if ((number == 10) || (number == 20) || (number == 30)
				|| (number == 40) || (number == 50) || (number == 60)
				|| (number == 70) || (number == 80) || (number == 90)) {
			number = number / 10;
			// For multiples of Ten
			return (tensMultiple[number - 1]);
		} else if (number == 100)
			return hundreds[0];
		else
			return null;

	}

}
