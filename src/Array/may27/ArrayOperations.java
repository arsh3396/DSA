package Array.may27;

import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};
        arrayOperations(arr, 6);
        sc.close();
    }

    public static void arrayOperations(int[] arr, int n) {
        // Write your code here
        int sum = 0, max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        System.out.print(sum + " " + sum/arr.length + " " + max);
    }
}
