package by.epam.ttr.main;

public class ArrayTask3 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап.
		// Создать массив из четных чисел этой последовательности.
		// Если таких чисел нет, то вывести сообщение об этом факте.

		int[] mas = new int[] { 87, 1, 213, 11, 23, 1, 7, 83, 1, 7, 543, 11 };

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d] ", mas[i]);
		}
		System.out.println('\n');

		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		int[] evenArray = new int[count];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				evenArray[j] = mas[i];
				j++;
			}
		}

		if (count == 0) {
			System.out.println("There are no even elements in the array");
		} else {
			for (int j = 0; j < evenArray.length; j++) {
				System.out.printf("{%d} ", evenArray[j]);
			}
		}
	}
}
