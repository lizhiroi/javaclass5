package class5;

public class Q4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String password = "abcd1234";
	        boolean isValid = isValidPassword(password);
	        System.out.println("Password is valid: " + (isValid ? password : ""));
	    }

	    public static boolean isValidPassword(String password) {
	        if (password.length() < 8) {
	            System.out.println("A password must have at least eight characters.");
	            return false;
	        }

	        for (char c : password.toCharArray()) {
	            if (!Character.isLetterOrDigit(c)) {
	                System.out.println("A password consists of only letters and digits.");
	                return false;
	            }
	        }

	        int digitCount = 0;
	        for (char c : password.toCharArray()) {
	            if (Character.isDigit(c)) {
	                digitCount++;
	            }
	        }

	        if (digitCount < 2) {
	            System.out.println("A password must contain at least two digits.");
	            return false;
	        }

	        return true;
		
			
		

	}

}
