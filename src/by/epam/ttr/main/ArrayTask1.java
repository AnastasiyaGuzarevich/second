package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask1 {

	public static void main(String[] args) {
		// Дан одномерный массив A[N]. Найти: max(a2, a4, a6 , ) + min(a1, a3, a5, )
		
		int n = 5;
		int[] mas = new int[n];
		
		Random rand = new Random();		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println('\n');
		
		//находим максимальное число из четных элементов массива
		int max = mas[0];
		for(int i = 0; i < mas.length; i = i + 2) {
			if(mas[i] > max) {
				max = mas[i];
			}
		}
		System.out.println("max even-number = " + max + "\n");
		
		//находим минимальное число из нечетных элементов массива
		int min = mas[1];
		for(int i = 1; i < mas.length; i = i + 2) {
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("min uneven-number = " + min + "\n");
		
		int sum;
		sum = max + min;
		
		System.out.println("max + min = " + sum);
	}

}
