package Array;

import java.util.*;

public class ElementOfGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findElementAtIndex(2, arr));

        sc.close();
    }

    public static int findElementAtIndex(int i, int[] arr) {
        // code here
        if (i >= arr.length) return -1;
        return arr[i];
    }
}
