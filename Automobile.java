import java.util.Scanner;
class Automobile{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter");
		int vehicles =sc.nextInt();
		int wheel =sc.nextInt();
		int two_wheel=(wheel-2*vehicles)/2;
		int four_wheel=vehicles-two_wheel;
		
	    System.out.println(four_wheel);
		System.out.println(two_wheel);
	}
}