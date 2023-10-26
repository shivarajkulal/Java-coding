import java.util.*;
class M{
public static void main(String[] args){
String str ="ABC0123011112233221100";
int n= str.length();
char[] ch =str.toCharArray();
Arrays.sort(ch);
System.out.println(ch);
int visited =-1;
int[] frequency = new int[n];
for(int i=0;i<n;i++){
	int count=1;
	for(int j=i+1;j<n;j++){
	if(ch[i]==ch[j]){
		count++;
		frequency[j]=visited;
	}	
	}
   if(frequency[i]!=visited)
	   frequency[i]=count;
}
for(int x=0;x<n;x++ )
	if(frequency[x]!=visited){
System.out.print(frequency[x]+" "); 
	}
//String result = frequency.toString();
//System.out.print(result);
}
}