package Array.may28;

import java.util.*;

public class SubtractionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 5};
        int[] b = {2, 3, 4, 5};

        int[] ans = subtractionOfTwoArray(a, b);

        for (int i : ans) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    static int[] subtractionOfTwoArray(int[] a, int[] b) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }

        return result;
    }
}
