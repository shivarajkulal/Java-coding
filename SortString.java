/*
Sorting String wihtout sort function
*/
class SortString(

public static void mian(String[] args){
      String original = "Shivarajkulal";
	  char temp = 0;
	  char[] chars = original.toCharArray();
	  for(int i=0;i<chars.length;i++){
	  for(int j=0;j<chars.length;j++){
	  if(chars[i]>chars[j]){
	     temp=chars[i];
		 chars[i]=chars[j];
		 chars[j]=temp;
	  }
	  }
	  }
	  for(int k=0;k<chars.length;k++){
	     System.out.println(chars[k]);
	  }
	  
}

)