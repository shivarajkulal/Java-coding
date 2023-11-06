import java.util.Scanner;

/* find length of string without using strlen() method */

public class Main {

	public static void main(String[] args) {
		int length=0;
		
                String s = "Shivaraj kulal";
                for (char c1 : s.toCharArray()) 
			length++;
		System.out.println("Length of String is : "+length);
		
	}

}