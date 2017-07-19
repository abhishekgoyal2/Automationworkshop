package aS05_Java;

public class Stringpanlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  "anana";
		String str1 ="";
		
		int size=str.length()-1;
		
		for (int j=size;j>=0;j--)
		{
			
			str1=str1+str.charAt(j);
			
			
			
		}
		
		System.out.println(str1);
		
		if(str1.equalsIgnoreCase(str))
		{
			System.out.print("String is a palindrome");
		}
		
		
		else
		{
			System.out.print("Sting is not a palindrome");
		}
		
		
	}

}
