package Array;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(ArrayProblem(arr, 3));
        sc.close();
    }

    static int ArrayProblem(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i+1] == sum) {
                count++;
            }
        }
        return count;
    }
}
