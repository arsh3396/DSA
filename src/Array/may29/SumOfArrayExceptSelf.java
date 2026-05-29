package Array.may29;

import java.util.*;

public class SumOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  {3, 6, 4, 8, 9};

        sumArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void sumArray(int[] arr) {
        // code here
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
    }
}
