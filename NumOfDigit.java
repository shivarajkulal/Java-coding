class H{
public static void main(String[] args){
int num=121;
int sum=0;
int count=numOfDigit(num);
System.out.println(count);


for(int i=0;i<count;i++){
         int rem=num%10;
        sum+=rem*(Math.pow(8,i));
		System.out.println(sum);
		num=num/10;
		
}
System.out.println(" decimal : "+sum);


}
public static int numOfDigit(int num){
     int count=0;
    while(num>0){
	count++;
	num=num/10;
	}
	return count;
}
}