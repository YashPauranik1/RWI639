package May31;
interface Show {
    // public, static and final
    final int a = 10;

    // public and abstract
    void display(int a,int b);
}
class TestClass implements Show {
	  
    // Implementing the capabilities of
    // interface.
    public void display(int a,int b){ 
    	int Sum=a+b;
      System.out.println("Sum of Absctract Method = "+Sum); 
    }

}   
public class ChackInterface {
	public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display(10,20);
        System.out.println("Final Vlaue = "+t.a);
    }
}


