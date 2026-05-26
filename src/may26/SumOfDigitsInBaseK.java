package may26;

import java.util.*;

public class SumOfDigitsInBaseK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sumBase(34, 6));
        sc.close();
    }

    static public int sumBase(int n, int k) {
        int sum = 0;

        while (n > 0) {
            sum += (n % k);
            n /= k;
        }

        return sum;
    }
}
