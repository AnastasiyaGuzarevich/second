package by.epam.ttr.main;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = new int[10];
		
		Random rand = new Random();
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		
		System.out.println("Source data array");
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println('\n');
		System.out.println("/////////////////////////////////////////////////");
		System.out.println();
		
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
		}
		
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println('\n');
		System.out.println("/////////////////////////////////////////////////");
		System.out.println();
		
		int max, tempp;
		for(int i = 0; i < ar.length - 1; i++) {
			max = i;
			
			for(int j = i + 1; j < ar.length; j++) {
				if(ar[j] > ar[max]) {
					max = j;
				}
			}
			tempp = ar[i];
			ar[i] = ar[max];
			ar[max] = tempp;
		}
		
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}

	}

}
