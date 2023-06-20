package class5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = checkLeapYear(year);
        System.out.println(isLeapYear);
        
        scanner.close();
    }
    
    public static boolean checkLeapYear(int year) {
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
            
        }

	}

}
