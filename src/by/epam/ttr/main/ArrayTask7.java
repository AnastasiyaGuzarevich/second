package by.epam.ttr.main;

public class ArrayTask7 {

	public static void main(String[] args) {
		// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
		// чтобы в одной строке была ровно одна единица, и вывести на экран.

		int[][] mas = new int[3][4];
		int n = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][0] = n;
			}

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
