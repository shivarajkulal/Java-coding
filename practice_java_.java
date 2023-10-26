import java.util.Scanner;
class Find_odd{
  public static void main(String args[]){
    int n;
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number of ele");
	 n=sc.nextInt();
    int[] array = new int[n];
	 System.out.println("enter the element one by one");
	for(int i=0;i<n;i++)
	{
	   array[i]= sc.nextInt();
	}
	 System.out.println("the element are");
	for(int i=0;i<n;i++)
	{
    System.out.println(array[i]);
	}
	for(int j=0;j<n;j++)
	{
		int ele= array[j];
		for(int i=j+1;i<n;i++)
		{   
	         //int ele= array[i];
			if(ele==array[i])
			System.out.println("element repeated is "+array[i]);
		   // else
		   // System.out.println("no error");
		}
	}
  }
  
}