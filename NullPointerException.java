package Jun10;

public class NullPointerException 
{
	public static void main(String[] args) 
	{
		String s=null;
		
		try
		{
			System.out.println("Hi");
			System.out.println(s.length());
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("java");
		
	}

}
