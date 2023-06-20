package class5;

public class Q2 {
	static double futureValue (double year) {
		return 1000*(Math.pow(1.1, year));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Years     FutureValue");
		System.out.println("1        "+ futureValue(1));
		System.out.println("2        "+ futureValue(2));
		System.out.println("3        "+ futureValue(3));
		System.out.println("4        "+ futureValue(4));
		System.out.println("5        "+ futureValue(5));
	}

}
