import java.util.Scanner;
import java.util.Arrays;
class ArraySort{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 int n= sc.nextInt();
	 int[] a=new int[n];
	 //System.out.println("enter ");
	 for(int i=0;i<n;i++)
		 a[i]=sc.nextInt();
	 Arrays.sort(a);
	  //System.out.println(" item are");
	  for(int i=0;i<n;i++)
		System.out.println(a[i]);
	 
		 
	}
}