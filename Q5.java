package class5;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter the number n:");
		int n = kb.nextInt();
		matrix(n);
		
		kb.close();
	}
		

	
	public static void matrix (int n) {
		
		Random rand = new Random ();
		
		int[][]array= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array[i][j]= rand.nextInt(2);
			}
		}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(array[i][j]+" ");
				}
			
			
			System.out.println();
			
		}
			
		
	}
	}

	

