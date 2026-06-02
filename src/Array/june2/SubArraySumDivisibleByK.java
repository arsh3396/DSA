package Array.june2;

import java.util.*;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {4,5,0,-2,-3,1};

        System.out.println(subarraysDivByK(nums, 5));

        sc.close();
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0, sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = ((sum % k) + k) % k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
