package Jun7;

public class OccurrencesOfCharacter {

		public int countOccurrences(String str, char ch) {
		    int count = 0;
		    for (int i = 0; i < str.length(); i++) {
		        if (str.charAt(i) == ch) {
		            count++;
		        }
		    }
		    return count;
		}
		public static void main(String[] args) {
			OccurrencesOfCharacter co = new OccurrencesOfCharacter();
	        String str = "Yash Pauranik";
	        char ch = 'a';
	        int occurrences = co.countOccurrences(str, ch);
	        System.out.println("The character '" + ch + "' occurs " + occurrences + " times in the string \"" + str + "\".");
	    
		}
		
	

}
