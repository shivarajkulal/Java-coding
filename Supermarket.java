import java.util.Scanner;
class Supermarket{
 public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
	 int product=1,rem,n;
	 n=sc.nextInt();
	 while(n>0)
	 {
		 rem=n%10;
		 product = product*rem;
		 n=n/10;
		 
	 }
	 System.out.println(product);
 }
}