package Jun4;
class Engine {  
	private String type;
	private int horsePower ;
	 //Constructor
	Engine(String type, int horsePower)
	{
	this.type = type;
	this.horsePower = horsePower;
	} 
	
	public String getType()
	{
	return type;	
	 }
	public void setType(String type)
	{
	this.type = type;	
	 }
	public int getHorsePower()
	{
	return horsePower;	
	 }
	public void setHorsePower(int horsePower)
	{
	this.horsePower = horsePower;	
	 }
}
class Car{
	private final String name;
	private final Engine engine;
	
	public Car(String name)
	{
	 this.name = name;	
	 this.engine = new Engine("EV",300);
	 System.out.println("Engine Type= "+this.engine.getType());
	 System.out.println("Engine Horse Powser="+this.engine.getHorsePower());
	}
	public String getName()
	{
	return name;	
	 }
	public Engine getEngine()
	{
	return engine;	
	 }
	}

 
public class CompositionProgram {
	public static void main(String[] args) {
		   Car car = new Car("Tata punch");
		System.out.println("Name of car: " +car.getName());
	}
}

