package Jun5;
import java.util.Scanner;
public class PalandromProgram 
{
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number");
	   int n=sc.nextInt();
	   int tamp=n;
	   int sum=0;
	   int r;
	   while(n>0)
	   {
		   r=n%10;
		   sum=(sum*10)+r;
		   n=n/10;
	   }
	   System.out.println(sum);
	   if(sum==tamp)
		{
			System.out.println("Number is Palandrom");
		}
		else
		{
			System.out.println("Number is Not Palandrom");
		}
	   
}
	
}
