package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask11 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран все НЕЧЕТНЫЕ столбцы, у которых первый элемент больше последнего.

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
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 1; j < mas[i].length; j = j + 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.printf("[%4d]", mas[i][j]);
				} else {
					System.out.printf("      ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

}
