package Array;

import java.util.*;

public class BasicOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        checkIfArrayElementIsEven();

        int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[3];
        double[][] arr3 = new double[1][5];

        System.out.println(linearSerch(arr, 7));

        System.out.println(linearSerchIndex(arr, 11));

        System.out.println(linearSerchIndex(new int[]{1, 2, 3}, 4));

        System.out.println(arr3);

        System.out.println(binarySerch(arr, 10));
    }

//printing even elements of an array
    static void checkIfArrayElementIsEven() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

//    linear search(returning presence)
    static boolean linearSerch (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

//linear search(returning index)
    static int linearSerchIndex (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

// first index of an array
    static int returnFirstIndex(int[] arr) {
        if (arr.length < 1) {
            return -1;
        }
        return arr[0];
    }

//    binary search
    static int binarySerch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
