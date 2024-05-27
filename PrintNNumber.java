package Day3;
import java.util.Scanner;
public class PrintNNumber {
	int n;
	void meth1()
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		PrintNNumber obj=new PrintNNumber();
		obj.meth1();
	}

}
