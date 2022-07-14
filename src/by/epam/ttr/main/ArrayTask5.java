package by.epam.ttr.main;

public class ArrayTask5 {

	public static void main(String[] args) {
		// Даны целые числа а1 ,а2 ,..., аn . 
		// Вывести на печать только те числа, для которых аi > i.
		
		int[] mas = new int[] { 0, 1, 2, 50, 4, 70, 6, 7, 8, 100, 11, 112 };

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d] ", mas[i]);
		}
		System.out.println('\n');
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				count++;
			}
		}

		int[] secondArray = new int[count];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				secondArray[j] = mas[i];
				j++;
			}
		}
		
		for (int j = 0; j < secondArray.length; j++) {
			System.out.printf("[%d] ", secondArray[j]);
		}

	}

}
