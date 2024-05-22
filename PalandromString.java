package InterviewProgram;
import java.util.*;
public class PalandromString 
{ 
	String s;
	String rev="";
	void math1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
	   
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("palandrom");
		}
		else
		{
			System.out.println("not a palandrom");
		}
	}
	public static void main(String[] args) 
	{
		PalandromString obj=new PalandromString();
		obj.math1();
	}

}
