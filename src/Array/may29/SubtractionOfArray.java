package Array.may29;

import java.util.*;

public class SubtractionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {1, 3, 2};

        int[] res = subtraction(a, b);
        for (int i : res) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    static int[] subtraction(int[] a, int[] b) {
        int[] ans = new int[Math.max(a.length, b.length)];

        int  n = a.length, m = b.length;
        int i = n-1, j = m-1, k = ans.length-1;

        while (i >= 0 || j >= 0) {
            int sub = 0;
            if (i >= 0) {
                sub += a[i];
                i--;
            }

            if (j >= 0) {
                sub -= b[j];
                j--;
            }
            ans[k] = sub;
            k--;
        }

        return ans;
    }
}
