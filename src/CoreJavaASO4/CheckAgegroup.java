package CoreJavaASO4;


import java.util.Scanner;


public class CheckAgegroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter age");
	      int age = in.nextInt();
	      System.out.println("You entered integer "+age);
	      
	      if (age>18)
	      {
	    	  System.out.println("Person is adult");
	      }
	      
	      else 
	    	  System.out.println("Person is not an adult");
	
	     
	}

}
