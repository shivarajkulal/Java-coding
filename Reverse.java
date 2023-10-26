import java.util.Scanner;
class Reverse{
   public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
        System.out.println("enter string ");
        String Reverse=" ";
		String str = sc.next();
        char strdemo;
		for(int i=0;i<str.length();i++)
		{ 
	
			strdemo=str.charAt(i);//h
			Reverse=strdemo + Reverse;
		
		}
          System.out.print(Reverse);
    
	    //for(int j=str.length();j>0;j--)
         //System.out.print(str.charAt(j));
}
}