package AS06_Java;

public class oddeven_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a[] = {0,1,3,4,0,12,7,-2,-222};
 
			try
			{
				
		for (int i=0;i<=a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("this is a negative number");
			}
		if(a[i]%2!=0 &a[i]>0)
		{
			System.out.println(" this is odd number " + a[i] );
				
		}
		
		else if(a[i]%2==0 &a[i]>0)
			System.out.println(" this is even number " + a[i] );
		}


			}
			catch(ArithmeticException E)
			{
				System.out.println("ArithmeticException is encountered: " + E);
			}
			catch(ArrayIndexOutOfBoundsException E)
		
		{
		System.out.println("array out of Bond Exception is encountered : " + E);
		}
		
catch(Exception E)
		
		{
		System.out.println("Exception is encountered : " + E);
		}

	}

}

//