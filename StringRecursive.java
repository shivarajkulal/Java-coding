
import java.util.*;

class StringRecursive{

public static void main(String[]args){

String str = "shivaraj";

System.out.println(reverseString(str));

}

public static String reverseString(String s){

if(s==null || s.length()<=1){
 return s;
}
System.out.println(s.substring(1));
return reverseString(s.substring(1))+ s.charAt(0);

}

}