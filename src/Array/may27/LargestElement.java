package Array.may27;

import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(largest(arr));
        sc.close();
    }

    public static int largest(int[] arr) {
        // code here
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }
        return largest;
    }
}
