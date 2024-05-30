package Day6;
class SumOfNumbers{
	public int Sum(int a,int b){
		return a+b;
	}
	public int Sum(int a,int b,int c) {
		return a+b+c;
	}
}
public class Overloading {
	
	public static void main(String[] args) {
		SumOfNumbers obj=new SumOfNumbers();
		//obj.Sum(2,3);
		//obj.Sum(10,20,30);
		System.out.println(obj.Sum(2,3));
		System.out.println(obj.Sum(1,20,30));
		
	}

}
