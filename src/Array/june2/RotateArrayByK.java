package Array.june2;

import java.util.*;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        rotateArray(arr, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void rotateArray(int[] nums, int k) {
        int rotate = k % nums.length;
        int[] temp = new int[rotate];
        for(int i = 0; i < rotate; i++) {
            temp[i] = nums[i];
        }

        for(int i = rotate; i < nums.length; i++) {
            nums[i - rotate] = nums[i];
        }
        int j = 0;
        for(int i = nums.length - rotate; i < nums.length; i++) {
            nums[i] = temp[j];
            j++;
        }
    }
}
