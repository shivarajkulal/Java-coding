// bubble sort java code
class Bubble{
public static void main(String[] args){
int[] arr ={10,30,50,5,45,67,89,32,23};
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
    if(arr[j]<arr[i]){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}
}//end for
}//end for
System.out.println("my Array after bubble sort");
for(int i=0;i<arr.length;i++){
	
	System.out.print(" "+arr[i]);
}//end for


}
}