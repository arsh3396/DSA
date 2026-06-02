package Array.june2;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        swapIndex(arr, 2, 6);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void swapIndex(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
