/*
Anagram program in java
*/
import java.util.*;

class Anagram{

public static void main(String[] args){
 
    Scanner in = new Scanner(System.in);
	System.out.println("Enter two string ");
	String str1 = in.next();
	String str2 = in.next();
	
	if(anagram(str1,str2))
	    System.out.println("Both Strings are anagram ");
	else
	    System.out.println("Both String are not anagram ");
}
static boolean anagram(String str1,String str2){

    if(str1.length()!= str2.length())
	    return false; 
    char[] array1 = str1.toLowerCase().toCharArray();
	char[] array2 = str2.toLowerCase().toCharArray();
	Arrays.sort(array1);
	Arrays.sort(array2);
	if(Arrays.equals(array1,array2))
	    return true;
	else 
	    return false;

}

}