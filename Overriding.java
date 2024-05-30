package Day6;

/*class Bank{
	int GetRetuer(){
		return 0;
	}
}*/
class SBI{
	int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI{
	int getRateOfInterest()
	{
		return 10;
	}
}
public class Overriding 
{ 
	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
	
		System.out.println("SBI RateOfInterest "+s.getRateOfInterest());
		System.out.println("ICICI RateOfInterest "+i.getRateOfInterest());

	}

}
