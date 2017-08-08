package aS05_Java;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
int l = scanner.nextInt();
int b = scanner.nextInt();
int Area=l*b;
		System.out.print("Area of rectangle "+"= " + Area);
	}
}


//