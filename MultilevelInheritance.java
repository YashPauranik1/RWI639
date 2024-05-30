package May29;
 class Animal{
	  void  eat(){
		  System.out.println("Eating");
	  }
 }
 class Dog extends Animal{
	 void bark()
	 {
		 System.out.println(" Barking");
	 }
 }
 class BabyDog extends Dog{
	 void weep() {
		 System.out.println("Weeping");
	 }
 }
public class MultilevelInheritance {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();//only one method is Executed
		Dog d=new Dog();
		d.bark();
		d.eat();// tow method Executed
		BabyDog b =new BabyDog();
		b.bark();
		b.eat();
		b.weep();//All  Method Executed
	}
	 

}
