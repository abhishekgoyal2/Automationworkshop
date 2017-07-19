package aS05_Java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  "best";
		String str1 ="";
		
		int size=str.length()-1;
		
		for (int j=size;j>=0;j--)
		{
			
			str1=str1+str.charAt(j);
			
			
			
		}
		
		System.out.println("Rever of String = "+str1);
		
		

	}

}
