package May28;
class Grupe{
	void grupeInfo() {
		System.out.println("Contain Grup Information");
	}
}
class Student extends Grupe{
	void studentInfo() {
		System.out.println("Contain Student Information");
	}
	
}

public class SingleInheritance {
	public static void main(String[] args) {
		Student obj=new Student();
		obj.grupeInfo();
		obj.studentInfo();
		
	}

	
}
