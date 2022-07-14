package by.epam.ttr.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] mas;

		System.out.print("How many elements do you want to add? > ");
				
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println();
			System.out.print("Please enter an INTEGER > ");
		}
		n = sc.nextInt();
		System.out.println();

		mas = new int[n];
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "] = ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println();
				System.out.println("Please enter an INTEGER > ");
				System.out.print("mas[" + i + "] = ");
			}
			mas[i] = sc.nextInt();
			sum = sum + mas[i];
		}

		System.out.println();
		String message = "Please enter 1 if you want to output the result as a string.\n\n"
				+ "Please enter any other INTEGER if you want the result to be displayed by a ladder. \n>";
		System.out.print(message);
		int menu;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Please enter an INTEGER > ");
		}
		menu = sc.nextInt();
		System.out.println();

		if (menu == 1) {
			//если вводим 1, то выводим информацию в строку
			for (int i = 0; i < mas.length; i++) {
				if (i == mas.length - 1) {
					System.out.print(" (" + mas[i] + ") ");
				} else {
					System.out.print(" (" + mas[i] + ") +");
				}
			}
			System.out.println(" = " + "[" + sum + "]");
		} else { //иначе выводим информацию лесенкой
			String delimiter = "\n\t";
			for (int i = 0; i < mas.length; i++) {
				System.out.print("(" + mas[i] + ") +" + delimiter);
				delimiter = delimiter + '\t';
			}
			System.out.println(" = " + "[" + sum + "]");
		}
	}

}
