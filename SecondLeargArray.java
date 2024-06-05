package Jun5;

public class SecondLeargArray {
	public static void main(String[] args) {
		int array[] = {10, 20, 25, 63, 5, 57};
		int temp = 0;
		int size=array.length;
		for(int i=0;i<=size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					 temp = array[i];
		             array[i] = array[j];
		             array[j] = temp;
		            
				}
			}
		}
	      System.out.println("Second largest number is:: "+array[size-2]);
	}

}
