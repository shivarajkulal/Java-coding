/*
for given array of integer ,return indexs of two num such that add up to certain number. 
each input have one solution & not use same element twice
*/
import java.util.Scanner;
class Target{
public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int[] array  = new int[8];
	 int target = 9;
	 int temp;
	 System.out.println("enter element");
	 for(int i=0;i<array.length;i++){
	    array[i] = in.nextInt();
	 }
	 System.out.println("Target:"+target);
	 for(int i=0;i<array.length;i++){
	    temp = target-array[i]; 
	 for(int j=i+1;j<array.length;j++){
	    if(array[j]==temp){
		    
			System.out.println("Two numder are:");
			System.out.println(array[i]+" Index is:"+i+","+array[j]+" Index is:"+j);
			System.out.println();
		}
	 }
	 }
	 
}
}