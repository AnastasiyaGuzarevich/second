package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask13 {

	public static void main(String[] args) {
		// Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		// первая строка справа налево,
		// вторая строка слева направо, третья строка справа налево и так далее.

		Random rand = new Random();
		
		int m = rand.nextInt(10) + 1;
		int n = rand.nextInt(10) + 1;
		
		int[][] mas = new int[m][n];
		
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
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.print(" =>");
			System.out.println();
			
			i++;
			
			if (i >= mas.length) {
				break;
			}
			
			for (int j = mas[i].length - 1; j >= 0; j--) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.print(" <=");
			System.out.println();
		}
		System.out.println();

	}

}
