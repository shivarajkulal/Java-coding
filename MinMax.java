import java.util.Scanner;
class MinMax{
public static void main(String[] args){
System.out.println("Enter number of element you want to enter ");
Scanner sc=new Scanner(System.in);
int num,ele,Fbig,Sbig;
num = sc.nextInt();

while(num>0){
	
   System.out.println("Enter the number :");
   ele = sc.nextInt();

   if(ele>Fbig)
{
  	 Sbig=Fbig;
	 Fbig=ele;
}
   if(ele>Sbig && ele<Fbig)
   {
      Sbig = ele;
   }
   
num=num-1;
}
System.out.println("First largest number is "+Fbig);
System.out.println("Second largest number is "+Sbig);

}
}