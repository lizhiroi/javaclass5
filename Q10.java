package class5;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
        System.out.print("Input an integer (positive/negative): ");
        int number = kb.nextInt();

        System.out.println("Factors of 3 of the said integer:");
        displayFactorsOfThree(number);
    }

    public static void displayFactorsOfThree(int number) {
        int originalNumber = number;
        StringBuilder factors = new StringBuilder();
        
        while (number % 3 == 0) {
            factors.append("3 * ");
            number /= 3;
        }
        
        factors.append("1");
        
        System.out.println(originalNumber + " = " + factors.toString());

	}

}
