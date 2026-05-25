package may25;

import java.util.*;

public class NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(nPr(5, 2));

        sc.close();
    }

    static long nPr(int n, int r) {
        long ans = 1;
        for (long i = n; i > n-r; i--) {
            ans *= i;
        }
        return ans;
    }
}
