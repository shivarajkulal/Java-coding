//write program to find repeatative element in array
import java.util.Scanner;
import java.util.Arrays;
class O{
public static void main(String[] args){
 int[] array = {7,6,5,3,8,9,6,2,1,4,8,6,0,4};
  Arrays.sort(array);
      System.out.println("enter number between 0-9 to check repeatation\n");
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
 for(int i=0;i<array.length;i++){
      if(array[i]==num){
	     System.out.println("repeated at index "+i);
	  }	  
     
 }
 System.out.println("no repetation");
}
}