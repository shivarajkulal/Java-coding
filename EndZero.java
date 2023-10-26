import java.util.Scanner;

class EndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0; // Count of non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }

        // Fill the remaining elements with zeros
        while (count < n) {
            a[count] = 0;
            count++;
        }

        System.out.println("Modified array:");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
