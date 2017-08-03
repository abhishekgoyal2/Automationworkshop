package AS06_Java;

public class arrayMiniMax_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a[] = {2,1,2,4,0,9,-1};
		int amax=a[0];
		int amin=a[0];
		
			try
			{
				
		for (int i=0;i<=a.length;i++)
		{
		
		if(a[i]>amax)
		{
			amax=a[i];
		}
		else
			
		{
			if(a[i]<amin)
				amin=a[i];
				
		}
		}
		System.out.println(" the max array from integer " + amax);
		System.out.println(" the minimum array from integer " + amin);
			}
catch(ArrayIndexOutOfBoundsException E)
		
		{
		System.out.println("Exception is encountered : " + E);
		}
		
catch(Exception E)
		
		{
		System.out.println("Exception2 is encountered : " + E);
		}
		
	}




		
		
	}
	
	

