package Jun6;
import java.util.Scanner;

public class RevarsString 
{
	String s;
	//int leng =s.length();
	String rev="";
	void meth()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
	   
		System.out.println(rev);
	}
	public static void main(String[] args) {
		RevarsString obj=new RevarsString();
		obj.meth();
	}


}
