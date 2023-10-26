//reverse an array
import java.util.Scanner;
class dtstrday1{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int start=0;
int c;
int[] a=new int[n];
int end=n;

for(int i=0;i<n;i++)
	a[i]= sc.nextInt();
while(start<end)
{
	c=a[start];
	a[start]=a[end];
	a[end]=c;
	start++;
	end--;
}
System.out.println("element are");
for(int i=0;i<n;i++)
	System.out.println(a[i]);
}
}
