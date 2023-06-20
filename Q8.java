package class5;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        int num1 = kb.nextInt();
	        System.out.print("Input the second number: ");
	        int num2 = kb.nextInt();
	        System.out.print("Input the third number: ");
	        int num3 = kb.nextInt();

	        boolean hasMidpoint = checkMidpoint(num1, num2, num3);
	        System.out.println("Check whether the three said numbers has a midpoint!");
	        System.out.println(hasMidpoint);
	    }

	    public static boolean checkMidpoint(int num1, int num2, int num3) {
	        if ((num1 <= num2 && num2 <= num3) || (num3 <= num2 && num2 <= num1)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	}


