import java.util.Scanner;
class WashMachine{
	public static void main(String args[])
	{
	  int weight;
	  Scanner sc = new Scanner(System.in);
	  weight=sc.nextInt();
	      if(weight==0)
		  System.out.println("0 minutes");
	      else if(weight<=2000)
			  System.out.println(" 25 minutes");
		  else if(weight>2000&&weight<4000)
              System.out.println(" 35 minutes");
          else if(weight>4000&&weight<7000)
              System.out.println(" 45 minutes");	
          else
              System.out.println("overloaded");		  
	  
	}
}