package Array.june3;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        missingNumberr(arr, 10);
        sc.close();
    }

    static void missingNumberr(int[] arr, int n) {
        int[] hash = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
