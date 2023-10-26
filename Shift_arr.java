//playing with number 
import java.util.Scanner;
class N{

public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter array length \n");
   int n = in.nextInt();
   int[] array1 = new int[n];
   System.out.println("Enter array element ");
   for(int i=0;i<n;i++){
      array1[i] = in.nextInt();
   }
   System.out.println("Enter array element to shift at end \n");
   int ele =in.nextInt();
   int j=0;
   int[] new_array = new int[n];
   for(int i=ele;i<n;i++){
       new_array[j++]=array1[i];
   }
   for(int i=0;i<ele;i++){
       new_array[j++]=array1[i];
   }
    for(int i=0;i<n;i++){
		System.out.print( new_array[i]+"  ");
	}
}
}