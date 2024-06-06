package Jun6;

public class MargeArray 
{

	public static void main(String[] args) {
         int temp=0;
		 int [] a= {1,2,3,4,10};
	     int [] b= {4,5,6,7,8,9};
	     int a_length=a.length;
		 int b_length=b.length;
		 int c_length=a_length+b_length;
		 int [] c=new int[c_length];
		 for(int i=0;i<a.length;i++)
		   {
			   c[i]=a[i];
			   System.out.print(c[i]+" ");
		   }
		 for(int i=0;i<b.length;i++)
		   {
			   c[a_length+i]=b[i];
			   System.out.println(c[a.length+i]+" ");
		   }
		  for(int i=0;i<c.length;i++)
		   {
			   
			   temp=c[i];
			   System.out.print(temp+" ");
		   }
		 /* int d_length=temp;
			 int [] d=new int[d_length];
			// System.out.println("Brefore Sorting Array is = ");
			int x=0;
			for(int i=0;i<d.length;i++) {
				for(int j=i+1;j<d.length;j++) {
					if(d[i]>d[j]) {
						x=d[i];
						d[i]=d[j];
						d[j]=x;
					}
				}
				System.out.println(d[i]);
			}*/
		
	}
	

}
