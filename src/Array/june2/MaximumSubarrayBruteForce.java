package Array.june2;

import java.util.*;

public class MaximumSubarrayBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));

        sc.close();
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, sum);
                sum += nums[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
