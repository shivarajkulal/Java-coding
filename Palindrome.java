
// Valid Polindrome

/*Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/
 
import java.util.Scanner;
class D  {    
public static void main(String args[])   {    
  Scanner in= new Scanner(System.in);
  String s = "ABCaCBA";
  String r = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
  int start=0;
  int flag=0;
  int last=r.length()-1;
   if(r.charAt(start)==r.charAt(last))
  {
	  flag=1;
	  start++;
	  last--;
  }
  else
	  flag=0;
 
 
  if(flag==1)
  System.out.println("polindrome");
  else
	   System.out.println(" not polindrome");

}

  
}  
