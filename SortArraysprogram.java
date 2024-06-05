package Jun5;

public class SortArraysprogram {
	public static void main(String[] args) {
		int[] ary = new int[] {9,7,5,3,1,2,4,6,8,10,-1,-2};
		System.out.println("Brefore Sorting Array is = ");
		int a=0;
		for(int i=0;i<ary.length;i++) {
			for(int j=i+1;j<ary.length;j++) {
				if(ary[i]>ary[j]) {
					a=ary[i];
					ary[i]=ary[j];
					ary[j]=a;
				}
			}
			System.out.println(ary[i]);
		}
		}

}
