package Array.june2;

import java.util.*;

public class SubArraySumDivisibleByKBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {4,5,0,-2,-3,1};

        System.out.println(subarraysDivByK(nums, 5));

        sc.close();
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];

        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = (i == 0)? arr[j] : arr[j] - arr[i - 1];
                if (sum % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
