package AS06_Java;

public class Averageofarray_useexception {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int  a[] = {0,1,3,4,0,12,8};
		int avg=0,sum=0;
			try
			{
				
		for (int i=0;i<a.length;i++)
		{
		
		sum=sum+a[i];
				
		}
		
		avg=sum/a.length;
		
		System.out.println(" the avreage of  array of all integers " + avg );
	
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
