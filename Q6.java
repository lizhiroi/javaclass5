package class5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter three numbers for sides of a triangle:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		area(a, b, c);
		

	}
	
	public static void area(double a,double b,double c) {
		double s = (a +b + c) /2;
		double areaTriangle = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("The area of the triangle is " + areaTriangle);
		
	}

}
