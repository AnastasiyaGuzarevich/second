package by.epam.ttr.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] ar = new int[10];
		Random rand = new Random();
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		
		System.out.print("Source data array\t\t ");
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println('\n');
		
		int min, temp;
		for(int i = 0; i < ar.length - 1; i++) {
			min = i;
			
			for(int j = i + 1; j < ar.length; j++) {
				if(ar[j] < ar[min]) {
					min = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
			
			System.out.print("Data array after " + i + " iteration\t ");
			for(int k = 0; k < ar.length; k++) {
				System.out.printf("%4d ", ar[k]);
			}
			System.out.println();
		}
		
		System.out.print("\nSorted data array\t\t ");
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}

	}

}
