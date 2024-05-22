package Day2;
import java.util.Scanner;
public class FindEvenOdd {
	int a;
	 void Chack()
	 {
		 System.out.println("Enter a number");
		 Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 if(a%2 == 0)
		 {
		    System.out.println("Enter number is Even"); 
		 }
		 else
		 {
			 System.out.println("Enter number is Odd");
		 }
		 
	 }
	 public static void main(String[] args) {
		 FindEvenOdd obj=new FindEvenOdd();
		obj.Chack();
	}


}
