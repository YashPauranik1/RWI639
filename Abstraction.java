package May31;
 abstract class Employ{
	abstract void Info();
}
 class EmpId extends Employ{

	@Override
	void Info() {
		System.out.println("EmpId is 101");	
	}
 }
 class Salary extends Employ{

	@Override
	void Info() {
		System.out.println("Employ Get Salary");
		
	}
	 
 }
public class Abstraction {
	public static void main(String[] args) {
		EmpId Obj1=new EmpId();
		Obj1.Info();
		Salary Obj2 =new Salary();
		Obj2.Info();
				
	}

}
