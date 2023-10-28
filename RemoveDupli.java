//program to remove duplicate
import java.util.*;
class Main{
public static void main(String[] args){
 String str = "sandeep kumar";
 String result = RemoveDuplicate(str);
 System.out.println(result);
}
static String RemoveDuplicate(String str){
 Set<Character> set = new HashSet<Character>();
 StringBuffer bf = new StringBuffer();
 for(int c=0;c<str.length();c++){
 Character s = str.charAt(c);
 if(!set.contains(s)){
	set.add(s);
    bf.append(s);
 }
 }
 return bf.toString();
}
}