package Array.may28;

import java.util.*;

public class FindTriplates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 6, 10, 18, 54};

        triplatesOfArray(arr);
        sc.close();
    }

    static void triplatesOfArray(int[] arr) {
        int count = 0, n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int j = i+1, k = n-1;
            while (j < k) {
                if ((int)Math.pow(arr[j], 2) == arr[i]*arr[k]) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
                j++;
                k--;
            }
        }
    }
}
