package by.epam.ttr.main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n = 5;
		double[] mas = new double[n];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "] = ");
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Please enter a DOUBLE > ");
			}
			mas[i] = sc.nextDouble();
		}
		System.out.println();

		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.print(" mas[" + i + "] = " + mas[i] + ";");			
		}
		System.out.println('\n');
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" mas[" + i + "] = " + mas[i] + ";");
		}
	}
}
