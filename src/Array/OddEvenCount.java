package Array;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = countOddEven(arr);

        System.out.println(ans[0] + " " + ans[1]);

        sc.close();
    }

    public static int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }
        return new int[]{odd, even};
    }
}
