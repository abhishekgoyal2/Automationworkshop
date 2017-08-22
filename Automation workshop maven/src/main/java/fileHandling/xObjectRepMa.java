package fileHandling;

public class xObjectRepMa
{
	private String locator;
	private String locatorvalue;
	
	public xObjectRepMa() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public xObjectRepMa(String locator, String locatorvalue) 
	{
		super();
		this.locator = locator;
		this.locatorvalue = locatorvalue;
		
	}
	
	@Override
	public String toString() 
	{
		return "[locator=" + locator + ", locatorvalue="
				+ locatorvalue + "]";
	}
	
	public String getLocator() 
	{
		return locator;
	}
	
	public void setLocator(String locator) 
	{
		this.locator = locator;
	}

	public String getLocatorvalue() 
	{
		return locatorvalue;
	}
	
	public void setLocatorvalue(String locatorvalue) {
		this.locatorvalue = locatorvalue;
	}
	
	
	

}
