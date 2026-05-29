package Array.may28;

import java.util.*;

public class MaxDistanceBetweenDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 2, 1, 2, 1, 4, 5, 3, 1};
        System.out.println(maxDistanceOfDuplicates(arr));
        System.out.println(maxDistance(arr));
        sc.close();
    }

//    using O(n^2)
    static int maxDistanceOfDuplicates(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int first = i, last = -1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    max = Math.max(max, j-i);
                }
            }
        }

        return max;
    }

//    using map
    static int maxDistance(int[] arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                max = Math.max(i - map.get(arr[i]), max);
            }
            else {
                map.put(arr[i], i);
            }
        }
        return max;
    }
}
