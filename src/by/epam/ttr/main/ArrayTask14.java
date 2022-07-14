package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask14 {

	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int[][] mas = new int[6][7];

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

		int k = 2; // номер выводимой строки
		int p = 3; // номер выводимого столбца

		System.out.println("row " + k);
		for (int element : mas[k]) {
			System.out.printf("[%4d]", element);
		}
		System.out.println("\n");
		
		System.out.println("column " + p);
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][p]);
		}
		System.out.println();
		
		
	}

}
