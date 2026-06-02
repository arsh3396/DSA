package Array.june2;

import java.util.*;

public class RotateArrayByKOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        rotateArr(arr, 5);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void rotateArr(int arr[], int d) {
        // code here
        d = d % arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
