package by.epam.ttr.main;

import java.util.Random;

public class ArrayTask15 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагоналях.

		int n = 6;
		int[][] mas = new int[n][n];

		matrixFilling(mas);

		matrixPrint(mas);
		
		System.out.println();
		System.out.println("Main dig");
		
		mainDig(mas);

		System.out.println('\n');
		System.out.println("Second dig");
		
		secondDig(mas);	

	}

	/////////////////////////////////////////////////////////////////////
	public static void matrixPrint(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println();
		}
	}
	/////////////////////////////////////////////////////////////////////

	public static void matrixFilling(int ar[][]) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(100);
			}
		}
	}
	/////////////////////////////////////////////////////////////////////
	
	public static void mainDig(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%4d]", ar[i][i]);
		}
	}
	/////////////////////////////////////////////////////////////////////
	
	public static void secondDig(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%4d]", ar[i][ar[i].length - 1 - i]);
		}
		
	}
}
