import java.util.Scanner;
import java.util.Arrays;
class Textile{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	int i,j=0,c=0;
	System.out.println("enter the number of socks in pile");
	int sock_no=sc.nextInt();
	int[] ar=new int[sock_no];
	System.out.println("enter the integer equivalent to colour of socks");
	for(i=0;i<sock_no;i++)
		ar[i]=sc.nextInt();
		 
		Arrays.sort(ar);//sorting array
		
	for(i=0;i<sock_no;i++)
		{
		int count=1;
		if(i!=sock_no-1)
		{	
		for(j=i+1;j<sock_no;j++)
		{
			
			if(ar[i]==ar[j])
			{    
			count++;
			}
			else
				break;
	    }//for j
					
        }				 
		System.out.println(count+" of socks has coloure "+ar[i]);
		    if(count%2!=0)
			c++;
            i+=(count-1);			   
        } //for i 
           			 
		System.out.println(c+" socks which don't have pair");		
				
	}
}
