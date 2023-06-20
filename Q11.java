package class5;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner kb = new Scanner(System.in);
	        System.out.print("Input an integer: ");
	        int number = kb.nextInt();

	        boolean isEveryDigitOdd = checkEvenDigits(number);
	        System.out.println("Every digit is odd: " + isEveryDigitOdd);
	    }

	    public static boolean checkEvenDigits(int number) {
	        number = Math.abs(number);

	        while (number > 0) {
	            int digit = number % 10;
	            if (digit % 2 == 0) {
	                return false;
	            }
	            number /= 10;
	        }

	        return true;

	}

}
