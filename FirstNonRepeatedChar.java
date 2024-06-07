package Jun7;

public class FirstNonRepeatedChar 
{
	public static void main(String[] args) {
        String string = "YashPauranikYash";
        int index = 0;
        char temp = ' ';
       
       if(string.length()==0){
         System.out.println("EMPTY STRING");
       }
       
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                temp = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First NonRepeating Character is " + temp);
        }
    }	
}
