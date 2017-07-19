package aS05_Java;

public class Reversenum_forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using for loop
		int number=36;
		
		int mod;
		int reverse=0;
		
		while(number!=0)
		
		{
		reverse =reverse*10;
		mod=number%10;
		reverse=reverse+ mod;
		number=number/10;
		
		}
	
		System.out.println("reverse of number using for loop = " + reverse);
		//using while
		
//		{
//			
//		}

		//using recursion
	}

}
