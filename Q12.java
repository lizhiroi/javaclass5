package class5;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = kb.nextLine();

	        boolean areAllCharactersVowels = checkAllVowels(str);
	        System.out.println("All characters are vowels: " + areAllCharactersVowels);
	    }

	    public static boolean checkAllVowels(String str) {
	        str = str.toLowerCase(); 

	        for (char ch : str.toCharArray()) {
	            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
	                return false;
	            }
	        }

	        return true;

	}

}
