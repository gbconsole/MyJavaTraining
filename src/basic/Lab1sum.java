package basic;

public class Lab1sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int x=5;
		int[] y= new int[] {5,4,3,2,1};
		System.out.println("sum of 1 to n once n ="+x+" is "+sum(x));
		System.out.println("sum of 1 to n once n ="+y.length+" is "+sum2(y));
	}
	public static int sum(int n) {
		if(n>1) {
			n=n+sum(n-1);
		}
		return n;
	}
	
	public static int sum2(int[] numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		return sum;
	}
}
