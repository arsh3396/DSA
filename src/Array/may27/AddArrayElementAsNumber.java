package Array.may27;

import java.util.*;

public class AddArrayElementAsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 4};
        int[] b = {2, 1};

        int[] ans = calSum(a, b, a.length, b.length);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    static int[] calSum(int a[], int b[], int n, int m) {
        // your code here
        int num1 = 0, num2 = 0;
        for (int i = 0; i < n; i++) {
            num1 += (a[i] * (int)Math.pow(10, n-1-i));
        }
        for (int i = 0; i < m; i++) {
            num2 += (b[i] * (int)Math.pow(10, m-1-i));
        }

        int sum = num1 + num2;
        int digit = (int)Math.log10(sum) + 1;
        int[] ans = new int[digit];

        for (int i = digit-1; i >= 0; i--) {
            ans[i] = sum % 10;
            sum /= 10;
        }
        return ans;
    }
}
