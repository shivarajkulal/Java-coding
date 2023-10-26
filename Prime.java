class I{
public static void main(String[] args){
   int  lower=2;
   int upper=20;
	for(int i=lower;i<=upper;i++)
	{
	   if(isPrime(i))
	   System.out.println(i);
	}
}
public static boolean isPrime(int n){
    int m=n/2;
	if(n<2){
	   return false;
	}
    for(int j=2;j<=m;j++)
	{
	   if(n%j==0)
	     return false;
	   
	}
	return true;
}
}