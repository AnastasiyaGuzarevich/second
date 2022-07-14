package by.epam.ttr.main;

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
		int n = 5;
		double[] mas = new double[n];
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		double mul = 1.0;
		double min;
		double max;
				
		Random rand = new Random();		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}
		
		for(int i = 0; i < mas.length; i++) {
			if(i % 2 == 0) {
			    System.out.printf("mas[" + i + "] = " + "%4.2f; ", mas[i]);
			}else {
				System.out.printf("MAS{" + i + "} = " + "%4.2f; ", mas[i]);
			}
			sum1 = sum1 + mas[i];
		}
		
		for(int i = 0; i < mas.length; i = i + 2) {
			sum2 = sum2 + mas[i];
		}
		
		for(int i = 1; i < mas.length; i = i + 2) {
			sum3 = sum3 + mas[i];
			mul = mul * mas[i];
		}
		
		min = mas[0];
		int j = 0;
		for(int i = 1; i < mas.length; i++) {
			if(mas[i] < min) {
			    min = mas[i];
			    j = i;
			}
		}
		
		max = mas[0];
		int c = 0;
		for(int i = 1; i < mas.length; i++) {
			if(mas[i] > max) {
			    max = mas[i];
			    c = i;
			}
		}
		
		System.out.println('\n');
		System.out.printf("sum1 = %4.2f \n", sum1); //общая сумма
		System.out.printf("sum2 = %4.2f \n", sum2); //сумма четных индексов
		System.out.printf("sum3 = %4.2f \n", sum3); //сумма нечетных индексов
		System.out.printf("mul = %4.2f \n", mul); //произведение нечетных индексов
		System.out.printf("min = mas[" + j + "] " + "%4.2f \n", min); //минимальное значение
		System.out.printf("max = mas[" + c + "] " + "%4.2f", max); //максимальное значение
	}

}
