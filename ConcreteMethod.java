package May31;
abstract class School{
	abstract void Clases();
	void Strudent() {
		System.out.println("Students are in the classroom");
		
	}
}
class Open extends School{

	@Override
	void Clases() {
		
		System.out.println("ClassRoom is open");
	}
}
public class ConcreteMethod {
	public static void main(String[] args) {
		Open o=new Open();
		// Calling an object of the Open class
		o.Clases();
		// Calling the concrete method
		o.Strudent();
	}

}
