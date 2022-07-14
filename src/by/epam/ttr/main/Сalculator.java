package by.epam.ttr.main;

import java.util.Scanner;

public class Сalculator {

	public static void main(String[] args) {
		double x;
		double y;
		double sum;
		double sub;
		double mult;
		double div;

		x = inputDoubleFromConsole("Enter the first number => ");
		y = inputDoubleFromConsole("Enter the second number => ");

		sum = addition(x, y);
		simplePrint(x, y, sum, '+');
		richPrint(x, y, sum, '+');

		sub = subtraction(x, y);
		simplePrint(x, y, sub, '-');

		mult = multiplication(x, y);
		simplePrint(x, y, mult, '*');

		div = division(x, y);
		simplePrint(x, y, div, '/');
	}
////////////////////////////////////////////////////////////////////////////////

	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a DOUBLE!\n" + message);
		}
		value = sc.nextDouble();
		return value;
	}
/////////////////////////////////////////////////////////////////////////////////

	public static double addition(double a, double b) {
		double sum;
		sum = a + b;
		return sum;
	}
/////////////////////////////////////////////////////////////////////////////////

	public static double subtraction(double a, double b) {
		double sub;
		sub = a - b;
		return sub;
	}
/////////////////////////////////////////////////////////////////////////////////

	public static double multiplication(double a, double b) {
		double mult;
		mult = a * b;
		return mult;
	}
/////////////////////////////////////////////////////////////////////////////////

	public static double division(double a, double b) {
		double div;
		    div = a / b;
		    return div;    
		
	}
/////////////////////////////////////////////////////////////////////////////////

	public static void simplePrint(double a, double b, double rez, char sign) {
		System.out.println();
		System.out.println(a + " " + sign + " " + b + " = " + rez);
	}
//////////////////////////////////////////////////////////////////////////////////

	public static void richPrint(double a, double b, double rez, char sign) {
		System.out.printf("[%.2f] %c [%.2f] = [%.2f]\n", a, sign, b, rez);

	}

}
