import java.util.Scanner;
/*getting ASCII value of given Character*/
class ASCII{
   public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  char  c = in.next().charAt(0);
  int x = c;
  System.out.println("ASCII Value of "+c+" is "+x);
  }
}