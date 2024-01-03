/*
Given an array `A` of length `N` and an integer `M`, write a Java program that finds and prints the minimum value of the function defined as the difference between elements in subarrays of length `M`. The program should output the minimum function value.

Example:
For the array `A = {5, 8, 1, 6, 2, 4, 7, 3}` and `M = 3`, what is the minimum function value?
*/
public class MinFunctionValueFinder {

    public static void main(String[] args) {
        int N = 8;
        int M = 3;
        int[] A = {5, 8, 1, 6, 2, 4, 7, 3};

        int minFunctionValue = Integer.MAX_VALUE;

        for (int i = 0; i <= N - M; i++) {
            int currentFunctionValue = A[i + M - 1] - A[i];

            if (currentFunctionValue < minFunctionValue) {
                minFunctionValue = currentFunctionValue;
            }
        }

        System.out.println("The minimum function value is: " + minFunctionValue);
    }
}
