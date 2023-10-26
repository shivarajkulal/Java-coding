class FrequentNum{
public static void main(String[] args){
  int num = 1201023021;
  String s = String.valueOf(num);
  int[] a = new int[s.length()];
  for(int i=0;i<s.length();i++){
    int d = Integer.parseInt(String.valueOf(s.charAt(i)));
	a[d]++;
  }
   for(int i=0;i<s.length();i++){
   System.out.println(a[i]+"-");
   }
   int max= a[0],pos=0;
   for(int i=0;i<s.length()-1;i++){
	   if(a[i+1]>max){
		   max=a[i+1];
		   pos=i+1;
	   }
   }
   System.out.println("max : "+max+", position: "+pos);
}
}