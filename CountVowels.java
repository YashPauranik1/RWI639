package Jun7;

public class CountVowels 
{
	public static void main(String[] args) {
		String s="yAsh pauranik";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			
			//if(ch=='a','e','i','o','u')
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
		    	||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				
				count++;
			}
		}
		System.out.println(count);
	}
	
	

}
