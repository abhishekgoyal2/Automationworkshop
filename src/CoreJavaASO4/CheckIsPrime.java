package CoreJavaASO4;

public class CheckIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=3;
		
		
		
			int i=2;
			
			while(number%i!=0)
			{	
		i++;
			}
			
			if(i==number)
			{
				System.out.print("number is prime " +number);
				
			}
		
			else 
				System.out.print("number is not prime " + number );
			
	}

	

}
