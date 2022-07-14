package by.epam.ttr.main;

public class Task8 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {899, 0, 212, 12, 23, 0, 7, 888, 0, 0, 777, 11};
		
		int countZero = 0;
		
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				countZero++;
			}
		}
		
		int[] zeroPositionsArray = new int[countZero];
		
		for(int i = 0, j = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				zeroPositionsArray[j] = i;
				j++;
			}
		}
		
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("[%d] ", mas[i]);
		}
		
		System.out.println('\n');
		for(int i = 0; i < zeroPositionsArray.length; i++) {
			System.out.printf("{%d} ", zeroPositionsArray[i]);
		}
	}
}
