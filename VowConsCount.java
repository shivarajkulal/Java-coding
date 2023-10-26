import java.util.Scanner;
class VowConsCount{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter you sentence ");
String str =sc.next();
//String str ="hello World";

  str=str.toLowerCase();
  int Vcount=0,Ccount=0;
  for(int i=0;i<str.length();i++)
   {
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	  {
		  Vcount++;
	  }
      else if(str.charAt(i)>='a' && str.charAt(i)<='z' )
         Ccount++;
   } 
    System.out.println("number of VOWELS are "+Vcount);
	System.out.println("number of CONSONENTS are "+Ccount);

}
}
//hello world 3 vowels 8 consonents