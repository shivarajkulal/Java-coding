//program of problem statement   
   
   import java.util.Scanner;
class turn{
public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   int x=0,y=0;
   System.out.println("enter turn");
   int turn=sc.nextInt();
   for(int i=1;i<=turn;i++)
    {
	   switch(i%5)
	   {   
	        case 0:x=x+10*i;
		         break;
	        case 1:x=x+10*i;
		         break;
			case 2:y=y+10*i;
		         break;
	        case 3:x=x-10*i;
		         break;
	        case 4:y=y-10*i;
		         break;
		case 5:x=x+10*i;
		break;
	
	   }
	}
       System.out.println(" ( "+x+","+y+")");
}
}
/* for test case 4:
                   input =6
				   output=(90,-20
				   */