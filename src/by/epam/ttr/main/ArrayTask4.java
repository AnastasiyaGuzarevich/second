package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask4 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. 
		// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
		
		double[] mas = new double[] { 87, 1, -213, 0, 23, 1, 0, -83, 0, -7.1, 543, 0 };
		
		for(int i = 0; i < mas.length; i++) {
			 System.out.printf("%4.2f  ", mas[i]);
		}
		System.out.println('\n');
		
		int count1 = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= 0) {
				count1++;
			}
		}
		System.out.println("number of positive elements => " + count1 + "\n");
		
		int count2 = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				count2++;
			}
		}
		System.out.println("number of negative elements => " + count2 + "\n");
		
		int count3 = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count3++;
			}
		}
		System.out.println("number of zero elements => " + count3);

	}

}
