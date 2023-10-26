import java.util.*;
import java.util.Arrays;
class ConsSwap{
	public static boolean vowel(char x)
	{
     
	 if(x=='a' || x=='e'|| x=='i'|| x=='o'|| x=='u')
		 return false;
	 else 
		 return true;
	}
	
	 public static String stringreverse(String s)
	 {
	 char[] c = s.toCharArray();
	 int start=0;
     int end =s.length()-1;
	 while(start<end){
	 if(!vowel(c[start]))
	 {
		 start++;
		 continue;
	 }
	 if(!vowel(c[end]))
	 {
		 end--;
		 continue;
	 }
	 
	 
	 char cr=c[start];
	 c[start]=c[end];
	 c[end]= cr;
	
	 start++;
	 end--;
	 }
	  return String.valueOf(c);
	}
	 public static void main(String args[])
	 {
     Scanner sc = new Scanner(System.in);
	 System.out.println("enter");
     String s =sc.next();
	 System.out.println(stringreverse(s));
	 }
}