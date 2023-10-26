import java.util.*;
class L{
public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  ArrayList<String> list = new ArrayList<String>();
  for(int i=0;i<5;i++){
  String temp =in.next();
  if(!list.contains(temp)){
     list.add(temp);
  }
  }
  System.out.println(list);
}
}