import java.util.*;
class A{
public static void main(String[] arg){
  int[] arr={10,20,30,40};
  int avg,sum=0,count=0;
  for(int ele : arr){
     count+=1;
     sum+=ele;
  }
  System.out.println("average : "+(sum/count));
}
}