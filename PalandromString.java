package Jun6;

import java.util.Scanner;

public class PalandromString 
{
	String s;
	String rev="";
	void Chack() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("String is PalandromString");
		}
		else
		{
			System.out.println("String is not PalandromString");
		}
	}
	public static void main(String[] args) {
		PalandromString obj=new PalandromString();
		obj.Chack();
		
	}

}
