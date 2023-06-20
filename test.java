package class5;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, rsize, clsize, val1, val2;
		int counter ;
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me the size or row and col : ");
		rsize = kb.nextInt();
		clsize = kb.nextInt();

		int[][] myarray = new int[rsize][clsize];

		for (i = 0; i < myarray.length; i++) {
			for (j = 0; j < myarray[i].length; j++) {
				myarray[i][j] = rand.nextInt(100);
			}
		}
		
		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for(i = 0 ; i< myarray.length;i++) {
			for(j=0; j < myarray[i].length;j++) {
				System.out.printf("%4d",myarray[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("============================ ");
		
		System.out.println("please give 2 number to search and replace : ");
		
		val1 = kb.nextInt();
		val2 = kb.nextInt();
		
		counter  = arrayModifier(myarray,val1,val2);
		if(counter >0 ) {
			System.out.println("============================ ");
			System.out.println("Changed made : ");
			
			System.out.println("============================ ");
			for(i = 0 ; i< myarray.length;i++) {
				for(j=0; j < myarray[i].length;j++) {
					System.out.printf("%4d",myarray[i][j] );
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Nothing found: ");
		}
		
		kb.close();

	}
//  my arra =    {{3,5},{7,9}{6,9}}
	public static int arrayModifier(int[][] arr,int fn , int sn){
		int counter = 0;
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length;j++) {
				if(arr[i][j]==fn) {
					arr[i][j] = sn;
					
					System.out.println("the replacement happend in the index : ["+ i + "]  and [" + j + " ]");
					counter++;
				}
			}
		}
		return counter;

			
		}
		
		
		

	}


