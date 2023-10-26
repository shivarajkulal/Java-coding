import java.util.*;
 public class p{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j < n; j++) {
                System.out.print((char)('A' + j));
            }
            for (int k = 0; k < i*2; k++) {
                System.out.print(" ");
            }
            for (int j = n-i-1; j < n; j++) {
                if(j<i) continue;
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
