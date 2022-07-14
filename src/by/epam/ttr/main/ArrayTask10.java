package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask10 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран первую и последнюю строки.
		// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

		int[][] mas = new int[4][5];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("first row");
		for (int element : mas[0]) {
			System.out.printf("[%4d]", element);
		}
		System.out.println("\n");

		System.out.println("last row");
		for (int element : mas[mas.length - 1]) {
			System.out.printf("[%4d]", element);
		}
		System.out.println("\n");
		
		System.out.println("even rows");
		for (int i = 0; i < mas.length; i = i + 2) {
			System.out.printf("[%3d] - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
