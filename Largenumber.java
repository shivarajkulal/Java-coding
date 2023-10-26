import java.util.Scanner;
class LargeNum{
public static void main(String[] args){
System.out.println("Enter number of element you want to enter ");
Scanner sc=new Scanner(System.in);
int num,ele,large=0;
num = sc.nextInt();


while(num>0){
System.out.println("Enter the number :");
ele = sc.nextInt();
   if(ele > large)
     large = ele;
num=num-1;
}
System.out.println("largest number is "+large);


}
}