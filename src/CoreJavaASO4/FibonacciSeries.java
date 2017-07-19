package CoreJavaASO4;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int fib0=0,fib1=1,fib2 = 0;
	int count =10;
	
		for (int i=0;i<=count;i++)
		{
			fib2=fib0+fib1;
			fib0=fib1;
			fib1=fib2;
			System.out.println(" "+fib2)	;
		}
	
		
	}
	
}
