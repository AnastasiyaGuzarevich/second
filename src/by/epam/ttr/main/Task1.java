package by.epam.ttr.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		int z;

		System.out.print("> ");
		a = sc.nextInt();

		System.out.print("> ");
		b = sc.nextInt();

		System.out.print("> ");
		c = sc.nextInt();

		System.out.print("> ");
		d = sc.nextInt();

		System.out.print("> ");
		e = sc.nextInt();

		z = a + b + c + d + e;

		String message = "Please enter 1 if you want to output the result as a string.\n\n"
				+ "Please enter any other number if you want the result to be displayed by a ladder. \n>";
		System.out.print(message);
		int menu;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(message);
		}
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println();
			System.out
					.println("(" + a + ") + (" + b + ") + (" + c + ") + (" + d + ") + (" + e + ") = " + "[" + z + "]");
		} else {
			System.out.println("(" + a + ") +\n\t (" + b + ") +\n\t\t (" + c + ") +\n\t\t\t (" + d + ") +\n\t\t\t\t ("
					+ e + ") =\n\t\t\t\t\t " + "[" + z + "]");
		}

	}

}
