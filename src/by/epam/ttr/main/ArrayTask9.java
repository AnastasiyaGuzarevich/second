package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask9 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран первый и последний столбцы.
		// поменять местами первые две строки

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
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0 || j == mas[i].length - 1) {
					System.out.printf("[%4d]", mas[i][j]);
				} else {
					System.out.printf("      ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// меняем местами первые две строки
		int[] ar = mas[0];
		mas[0] = mas[1];
		mas[1] = ar;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
