package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask2 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
		//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
		
		int n = 10;
		int[] mas = new int[n];
		
		Random rand = new Random();		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		
		System.out.println("Source data array");
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println('\n');
		
		int z = 560;
		System.out.println("compared the array elements with => " + z + "\n");
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] > z) {
				mas[i] = z;
			}
		}
		
		System.out.println("Data array after replacements");
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println('\n');
		
		int sum = 0;		
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] == z) {
				sum++;
			}
		}
		System.out.println("number of replacements = " + sum);

	}

}
