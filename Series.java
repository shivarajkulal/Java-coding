import java.util.*;
//import java.util.Arrays;
class Series{
	public static float fact(float x)
	{ float s=0;
	 if(x==0 || x==1)
	   return s=1;
	 if(x!=0)
       return s=x*fact(x-1);
      return s;
	}
	public static void main(String[]args)
	{
	float sum,sum1=1,sum2=1;
    Scanner sc= new Scanner(System.in);
	float n=sc.nextFloat();
	for(float i=1;i<=n;i++)
	{
	if(n%2==0)
	sum1 = sum1+(n/fact(n));
    else
    sum2 = sum2+(n/fact(n));
	//sum = sum2-sum1;
    }
	System.out.println(sum2-sum1);
	}
}