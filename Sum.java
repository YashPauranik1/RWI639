package Day2;

import java.util.Scanner;
public class Sum {
	int a,b;
    void Addition()
    {
    	System.out.println("Enter two number");
    	Scanner sc =new Scanner(System.in);
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("Addition "+a+"+"+b);
    	int Sum=a+b;
    	System.out.println(Sum);
    }
public static void main(String[] args) {
	
	Sum obj=new Sum();
	obj.Addition();
	}

}
