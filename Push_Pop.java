import java.io.*;
import java.util.*;
class C{
static void stack_push(Stack stk,int x){
	stk.push(x);
}
static void stack_pop(Stack stk){
	for(int i=0;i<5;i++)
   {
	stk.pop();
   }
}
public static void main(String[] args){
   Stack<Integer> stk = new Stack<>();
   boolean result = stk.empty();
   System.out.println(result);
   for(int i=0;i<5;i++)
   {
   stack_push(stk,i);
   }
   stack_pop(stk);
   boolean Newresult =stk.empty();
   System.out.println(Newresult);
   System.out.println(stk);
}
}