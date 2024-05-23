package Day3;
import java.util.Scanner;
public class SumOfNnumbers 
{
	int n,sum ;
	  void sum()
	  {
		  System.out.println("Enter a number");
		  Scanner sc= new Scanner(System.in);
		  n=sc.nextInt();
		  for(int i=0;i<=n;i++)
		  {
			  sum=sum+i;
		  }
		  System.out.println("Sum of n number is = "+sum);
	  }
	  public static void main(String[] args) 
	  {
		  SumOfNnumbers obj=new SumOfNnumbers();
		  obj.sum();
	  }

}
