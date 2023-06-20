package class5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);
	        System.out.print("Input an integer (positive/negative): ");
	        int number = kb.nextInt();

	        int firstDigit = extractFirstDigit(number);
	        System.out.println("Extract the first digit from the said integer:");
	        System.out.println(firstDigit);
	    }

	    public static int extractFirstDigit(int number) {
	        number = Math.abs(number);

	        while (number >= 10) {
	            number /= 10; 
	        }

	        return number;
	    }

	}


