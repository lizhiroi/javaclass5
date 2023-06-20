package class5;

public class Q1 {
static void pentNum( int n) {
	for (n=1; n<=50; n++) {
		int p = (n-1)*n+n*(n+1)/2;
		System.out.print(p +" ");
	}
			
		}

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		pentNum(50);
		
		

	}

}
