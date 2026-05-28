package Array.may28;

import java.util.*;

public class ReverseArrayUsingTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverseAnArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void reverseAnArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
