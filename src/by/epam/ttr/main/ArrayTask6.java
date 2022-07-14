package by.epam.ttr.main;

public class ArrayTask6 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . 
		// Поменять местами наибольший и наименьший элементы.
		
        double[] mas = new double[] { 87, 1, -213, 0, 23, 1, 0, -83, 0, -7.1, 543, 0 };
		
		for(int i = 0; i < mas.length; i++) {
			 System.out.printf("%4.2f  ", mas[i]);
		}
		System.out.println('\n');
		
		
		double minElem = mas[0];
		int min = 0;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] < minElem) {
				minElem = mas[i];
				min = i;
			}
		}
		System.out.println("min = " + minElem + "\n");
		
		
		double maxElem = mas[0];
		int max = 0;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] > maxElem) {
				maxElem = mas[i];
				max = i;
			}
		}
		System.out.println("max = " + maxElem+ "\n");
		
		
		double temp;
		temp = mas[max];
		mas[max] = mas[min];
		mas[min] = temp;
		
		for(int i = 0; i < mas.length; i++) {
			 System.out.printf("%4.2f  ", mas[i]);
		}

	}

}
