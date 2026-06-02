package Array.june1;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(palindrome(arr));
        sc.close();
    }

    static boolean palindrome(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
