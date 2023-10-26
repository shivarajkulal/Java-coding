import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
class K{
public static void main(String[] args){
   ArrayList<String> list=new ArrayList<String>();
   list.add("java"); 
   list.add("python");
   list.add("C");
   list.add("C++");
   list.add("Swift");
   System.out.println("Array LIst: "+list+" ");  
   System.out.print(" get method used :");   
   for(int i=0;i<list.size();i++)
   {
	   System.out.print("  "+list.get(i)+"  ");
   }
   list.set(1,"anconda");
   list.set(4,"BMW");
   System.out.println();
   System.out.println("Array LIst after set method: "+list+" ");
   list.sort(Comparator.reverseOrder());
   System.out.println("Array LIst after reverse Order : "+list+" ");    

 
   //  list.sort(Comparator.naturalOrder());
  // System.out.println("Array LIst after natural Order : "+list+" ");    

}
}