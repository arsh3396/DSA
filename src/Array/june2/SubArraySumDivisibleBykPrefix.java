package Array.june2;

import java.util.*;

public class SubArraySumDivisibleBykPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {4,5,0,-2,-3,1};

        System.out.println(subarraysDivByK(nums, 5));

        sc.close();
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (prefix[i] % k == 0) {
                count++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((prefix[j] - prefix[i-1]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
