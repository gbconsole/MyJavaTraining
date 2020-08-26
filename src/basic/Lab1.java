package basic;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		System.out.println("Calculation of "+x+"! is "+factorial(x));
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		else {
			n=n*factorial(n-1);
		}
		return n;		
	}
	 

}
