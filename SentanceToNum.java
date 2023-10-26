//Convert a sentence into its equivalent mobile numeric keypad sequence
import java.util.Scanner;

class E{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String arr[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","8","88","888","9","99","999","9999"};
		String digit =phonechar(s,arr);
		System.out.println(digit);
	}
	static String phonechar(String r,String[] arr){
		String s=r.toUpperCase();
		int n=s.length();
		String output="";
		for(int i=0;i<n;i++){
			if(s.charAt(i)==' ')
				output=output+'0';
			else{
				int position =s.charAt(i)-'A';
				output = output+arr[position];
			}
		}
		return output;
	}
	
}