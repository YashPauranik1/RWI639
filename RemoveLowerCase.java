package Jun7;

public class RemoveLowerCase 
{
	public static void main(String[] args) 
	{
		String s="Yash PAURANIK";
		String uper=" ";
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') {
				uper=uper+c;
			}
			else {
				continue;
			}
		
		}
		System.out.println(uper);		
	}
}
