package Inheritance;

  public class Animal extends Dogs
{
	void Run()
	{
		System.out.println("Animal is raning");
	}
	
}
 class Dogs 
{
	void Eat()
	{
		System.out.println("Dog is Eating");
	}
}	
	public static void main(String[] args) 
	{
		Animal da=new Animal();
		da.Run();
		da.Eat();	
	}
	
}
