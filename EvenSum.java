//sum even number in an array
import java.util.Scanner;
class Sum{
public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int[] array  = new int[10];
	 int sum = 0; 
	 System.out.println("enter element");
	 for(int i=0;i<array.length;i++){
	     array[i] = in.nextInt();
		 if(array[i]&1==0)
		 sum += array[i];
	 }
	 System.out.println("sum is : "+sum);
}
}