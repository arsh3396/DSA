package Array.may27;

import java.util.*;

public class SecondLargestOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SecondLargest(arr, arr.length);
        sc.close();
    }

    public static void SecondLargest(int[] arr, int n) {
        // Write code here
        int largest = arr[0], secondLargest = -1;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
            else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }
}
