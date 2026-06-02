package Array.june2;

import java.util.*;

public class RotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        rotateArrayByOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }
}
