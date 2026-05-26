package may25;

import java.util.*;

public class NCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(nCr(5, 2));
        System.out.println();

        sc.close();
    }

    static int nCr(int n, int r) {
        if (r > n) return 0;
        long ans = 1;
        for (int i = 1; i <= n-r; i++) {
            ans *= (n-i+1);
            ans /= i;
        }

        return (int)ans;
    }
}
