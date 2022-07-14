package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask12 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов.
		// Определить, сколько раз встречается число 7 среди элементов массива

		Random rand = new Random();
		
		int n = rand.nextInt(10) + 1;
		int m = rand.nextInt(10) + 1;
		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int count = 0;
		int x = 7;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (Math.abs(mas[i][j]) == x) {
					count++;
				}
			}
		}
		System.out.println("number of elements equal to 7 => " + count);

	}

}
