package Jun10;

public class ArithmeticException 
{
	 public static void main (String[] args) { 
	      int a=5; 
	      int b=0;
	      System.out.println("1");
	      System.out.println("2");
	      System.out.println(a);
	        try{ 
	          System.out.println(a/b); 
	        } 
	      catch(Exception e){ 
	        e.printStackTrace(); 
	      } 
	        System.out.println("Complited");
	    } 

}
