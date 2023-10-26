import java.util.Scanner;
 
  
class MinMax
{  
    public static void main(String[] args){
		Scanner sc=new  Scanner(System.in);
    int limit, num, fbig = 0, sbig = 0;  
  
    System.out.println("Enter the limit ");  
    limit= sc.nextInt();
  
       while(limit > 0)  
    {  
        System.out.println("Enter the number :");
         num = sc.nextInt();
  
        if(num > fbig)  
        {  
            sbig = fbig;  
            fbig = num;  
        }  
        if(num > sbig && num < fbig)  
        {  
            sbig = num;  
        }  
  
        limit--;  
    }  
  
    System.out.println("First Big is "+fbig);  
    System.out.println("Second Big is "+sbig);  
  
    
}
} 
 