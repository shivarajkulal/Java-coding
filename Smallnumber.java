import java.util.Scanner;
class SmallNum1{
public static void main(String[] args){
System.out.println("Enter number of element you want to enter ");
Scanner sc=new Scanner(System.in);
int num,ele;
int smallest=Integer.MAX_VALUE;//integer max element
num = sc.nextInt();


while(num>0){
      System.out.println("Enter the number :");
      ele = sc.nextInt();
      if(ele < smallest)
      smallest = ele;
num=num-1;
}
System.out.println("Smallest  number is "+smallest);


}
}