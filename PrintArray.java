package Jun5;

import java.util.Scanner;

public class PrintArray {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Array size");
		    int n= sc.nextInt();
		  //  int q;
			int[] a = new int[n];
			for (int i=0; i<a.length;i++) {
			    a[i] =sc.nextInt();
			   
			}
			for(int x:a)
			{
				System.out.print(x+" " );
			}
}
				
}
	

