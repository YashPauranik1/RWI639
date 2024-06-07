package Jun7;

public class CountLowerUpre
{
	 public static void main(String args[])
	    {
	        String str = "Yash PauraniK";
	        int upper = 0, lower = 0;
	 
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                upper++;
	            else {
	                lower++;
	            }
	           
	        }
	        System.out.println("Upper Char is=>"+upper);
	        System.out.println("Lower Char is=>"+lower);
	    }

}
