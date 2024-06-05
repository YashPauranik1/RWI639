package Jun5;

public class BinarySearch {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		int search=6;
		int lindex=0;
		int hindex=arr.length;
		int mindex=(lindex+hindex)/2;
		while(lindex<=hindex)
		{
			if(arr[mindex]==search) 
			{
				System.out.println(mindex);
				break;
			}
			else if(arr[mindex]<search)
			{
				lindex=mindex+1;
			}
			else
			{
				hindex=mindex-1;
			}
			mindex=(lindex+hindex)/2;
			
		}
		if(lindex>hindex)
		{
			System.out.println("noy ");
		}
 }

}
