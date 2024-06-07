package Jun7;

import java.util.Arrays;

public class Anagrams 
{
	public static void main(String[] args) {
	     
	      String inputStr1 = "Heart";
	      String inputStr2 = "Earth";
	      System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
	      inputStr1 = inputStr1.toLowerCase();
	      inputStr2 = inputStr2.toLowerCase();
	     
	      if(inputStr1.length() == inputStr2.length()) 
	      { 
	         char[] array1 = inputStr1.toCharArray();
	         char[] array2 = inputStr2.toCharArray();
	         Arrays.sort(array1);
	         Arrays.sort(array2);
	         if(Arrays.equals(array1, array2))
	         {
	            System.out.println("Both strings are anagram");
	         } else 
	         {
	            System.out.println("Both strings are not anagram.");
	         }
	      } 
	      else
	      {
	         System.out.println("Both strings are not anagram.");
	      }
	   }

}
