package by.epam.ttr.main;

public class ArrayTask18 {

	public static void main(String[] args) {
		// Получить квадратную матрицу порядка n:
		
		int n = 6;
		int[][] mas = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i][mas[i].length - 1 -i] = i+1;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
