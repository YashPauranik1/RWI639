package Inheritance;
class Amimal
{
	void run()
	{
		System.out.println("I am raning");
	}
}
class Dog extends Amimal
{
	void Eat()
	{
		System.out.println("I am Eating");
	}
}
public class Demo extends Dog
{
	public static void main(String[] args) 
	{
		
		Dog d=new Dog();
		d.run();
	}

}
