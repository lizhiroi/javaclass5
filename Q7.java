package class5;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter three numbers:");
		

	    int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
	        boolean isConsecutive = checkConsecutive(num1, num2, num3);
	        System.out.println("Are the numbers consecutive? " + isConsecutive);
	        
	        kb.close();
	    }

	    public static boolean checkConsecutive(int num1, int num2, int num3) {
	        if (num2 == num1 + 1 && num3 == num2 + 1) {
	            return true;
	        } else if (num2 == num1 - 1 && num3 == num2 - 1) {
	            return true;
	        } else {
	            return false;
	        }
	    }

}
