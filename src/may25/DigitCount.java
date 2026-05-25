package may25;

import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(digitCount(1122334, 2, 0));

        sc.close();
    }

    static int digitCount(int num, int digit, int count) {
        if (num <= 0) {
            return count;
        }
        if (num % 10 == digit) count++;
        return digitCount((num / 10), digit, count);
    }
}
