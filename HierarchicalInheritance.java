package May29;
class A{
	void Print() {
		System.out.println("This is Class A method");
	}
}
class B extends A{
	void Print1() {
		System.out.println("This is Class B method");
	}
	
}
class C extends A{
	void Print2() {
		System.out.println("This is Class C method");
	}
	
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		A a =new A();
		a.Print();
		B b=new B();
		b.Print();
		b.Print1();
		C c=new C();
		c.Print();
		c.Print2();
		
	}
	
	

}
