import java.util.Scanner;
//frequancy of number in a Array for each element
class J{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter Array length :\n");
		int n = in.nextInt();
		System.out.println(" Enter the Array Element :\n");
		int[] arr = new int[n];
		
		int visited = -1;
		int frequency[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		
		
		
		for(int j=0;j<n;j++){
			int  count = 1;
			
			for(int k=j+1;k<n;k++){
				if(arr[j]==arr[k]){		
					count++;
					frequency[k]=visited;//visite = -1
				}
				
			}
			
			if(frequency[j]!=visited)//visited = -1
			frequency[j]=count;	
			
		
		}
		for(int x=0;x<n;x++){
		if(frequency[x]!=visited)	
		System.out.println("\n Array Contains element of frequency \n"+arr[x]+" : "+frequency[x]);
		}
	}
}
