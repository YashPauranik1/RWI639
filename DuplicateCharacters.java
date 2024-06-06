package Jun6;

public class DuplicateCharacters 
{
	public static void main(String[] args)
	{
		String s="Hello Java";
		int count;
		char c[]= s.toCharArray();
		System.out.println("Deplicate ");
		for(int i=0;i<c.length;i++) {
			count=1;
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j] && c[i]!=' ') {
					count++;
					c[j]='0';
					
				}
			}
			
			if(count>1 && c[i]!='0') 
				System.out.println(c[i]);
		}
	}

}
