package aS05_Java;

public class Elementarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={1,12,0,5,4};
		int sum=0;
		
		for (int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
		}

		System.out.print("sum of elements of array "+ " = " + sum);
	}

}
