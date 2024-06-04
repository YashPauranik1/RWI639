package Jun4;
class Company{
	String companyName;
	String companyLocation;
	public Company(String companyName, String companyLocation) 
	{
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	@Override
	public String toString() {
		return this.companyName+"---"+this.companyLocation;
	}	
}
class Employee{
	int empNo;
	String empName;
	float empSalary;
	Company comp;
	public Employee(int empNo, String empName, float empSalary, Company comp) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
		this.comp = comp;
	}
	@Override
	public String toString() {
		return this.empNo+"---"+this.empName+"---"+this.empSalary+"---"+this.comp;
	}		
}

public class AggregationProgram {
	public static void main(String[] args) {
		Company comp=new Company("Infosis","Chennai");
		Employee dhruv=new Employee(111,"Dhruv",45000,comp);
		System.out.println(dhruv);
		Employee abhi=new Employee(222,"Abhi",50000,comp);
		System.out.println(abhi);
	}

}
