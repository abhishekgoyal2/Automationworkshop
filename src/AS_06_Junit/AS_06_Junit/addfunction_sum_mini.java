//
package AS_06_Junit.AS_06_Junit;

import org.junit.Test;

public class addfunction_sum_mini {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a;

	int b;

	@Test
	public void reversestring() {
		reversestring("nano");
		sum(2, 3);
		max();
		min();
	}

	public static int sum(int a1, int b1) {
		int add = a1 + b1;
		System.out.println("sum of numbers = " + add);
		return (add);
	}

	public static void max() {

	}

	public static void min() {

		System.out.println("sum of numbers = ");

	}

	public static String reversestring(String str)

	{
		String str1 = "best";
		String str2 = "";

		int size = str1.length() - 1;

		for (int j = size; j >= 0; j--) {

			str2 = str2 + str.charAt(j);
		}

		System.out.println("Rever of String = " + str2);
		return str2;
	}
}
