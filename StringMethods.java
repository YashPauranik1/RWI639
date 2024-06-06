package Jun6;

public class StringMethods 
{ 
	void Length() {
		String  s= "Hello Java";
		System.out.println(s);
         int length=s.length();
         System.out.println(length);	
	}
	void Concat() {
		String frist="This";
		String second="Is";
	    String Third="Java";
	    String Concated= frist.concat(second).concat(Third);
	    System.out.println(Concated);
		
	}
	void Equal() {
		String first = "java programming";
	    String second = "java programming";
	    boolean result= first.equals(second);
	    System.out.println(result);
	   
	}
	void Contain() {
		 String str1 = "Java is awesome";
		 boolean result = str1.contains("awesome");
		 System.out.println(result);
	}
	void SubString() {
		 String str1 = "java is fun";
	     System.out.println(str1.substring(5,11));
	}
	void Join() {
		String s1="Wellcome";
		String s2="To";
		String s3="Java";
	    String s4 = String.join(" ", s1, s2, s3);
		System.out.println(s4);
	}
	public static void main(String[] args) {
		StringMethods obj=new StringMethods();
		obj.Length();
		obj.Concat();
		obj.Equal();
		obj.Contain();
		obj.SubString();
		obj.Join();
		
		
	}
	
}
