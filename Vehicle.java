import java.util.Scanner;
class vehicles{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		int vehicles =sc.nextInt();
		int wheel =sc.nextInt();
		int tv=(wheel-2*vehicles)/2;
		System.out.println(tv);
		
	}
}