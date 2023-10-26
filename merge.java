//merge sorting technique
class Merge{
void sort(int a[],int first,int last){
   if(first<last){
   
   int mid = (first+last)/2;
   sort(a,first,mid);
   sort(a,mid+1,last);
   merge(a,first,mid,last);
   }
}
void merge(int a[],int first,int mid,int last){

    int n1=mid-first+1;
	int n2=last-mid;
    int[] firstarray=new int[n1];
	int[] secondarray=new int[n2];
	for (int i = 0; i < n1; i++)    
    firstarray[i] = a[first + i];    
    for (int j = 0; j < n2; j++)    
    secondarray[j] = a[mid + 1 + j];
	int i=0;
	int j=0;
	int k=first;
    while(i<n1&&j<n2){
	    if(firstarray[i]<=secondarray[j]){
		      a[k]=firstarray[i];
			  i++;
		 }
		else
		{
		  a[k]=secondarray[j];
		  j++;
		}
		k++;
	}
    while(i<n1){
	a[k]=firstarray[i];
	i++;
	k++;
	}	
	while(j<n2){
	a[k] = secondarray[j];
	j++;
	k++;
	}
}
void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
 
public static void main(String[] args){

    int[] a={10,30,25,15,7,81,74,69,13};
		
	Merge ob = new Merge();
    int n=a.length;
    System.out.println("\nBefore sorting array elements are - ");  
	ob.printArray(a,n);  
    ob.sort(a,0,n-1);  
    System.out.println("\nAfter sorting array elements are - ");  
    ob.printArray(a,a.length);  
    System.out.println(""); 
	
	
  }//end main
}//end class