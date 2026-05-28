package Array.may28;

import java.util.*;

public class ShortestDistanceBetweenEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 7, 11, 13, 15, 17, 19};
        System.out.println(shortestDistance(arr));
        sc.close();
    }

    static int shortestDistance(int[] arr) {
        int even = 0;
        int distance = Integer.MAX_VALUE, prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (prev == -1) {
                    prev = i;
                }
                else {
                    distance = Math.min(distance, i - prev);
                    prev = i;
                }
                even++;
            }
        }
        return (even < 2)? -1 : distance;
    }
}
