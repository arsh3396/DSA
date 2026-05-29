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
        int evenCount = 0;
        int distanceBWEven = Integer.MAX_VALUE, prevIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (prevIndex == -1) {
                    prevIndex = i;
                }
                else {
                    distanceBWEven = Math.min(distanceBWEven, i - prevIndex);
                    prevIndex = i;
                }
                evenCount++;
            }
        }
        return (evenCount < 2)? -1 : distanceBWEven;
    }
}
