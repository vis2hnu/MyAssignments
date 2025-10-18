package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=0;
		int b=1;
		int c;
		int input=8;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=input-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}*/
		 int n = 8, first = 0, second = 1;
		 System.out.println("Fibonacci Series till " + n + " terms:");

		 for (int i = 1; i <= n; i++) {
			 System.out.print(first + " ");
			 int nextTerm = first + second;
			 first = second;
			 second = nextTerm;
	    }	
	}
}
