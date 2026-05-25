package may25;

import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(convertfive(1550055));

        sc.close();
    }

    static int convertfive(int num) {
        if (num == 0) return 5;
        int digitCount = (int)Math.log10(num), sum = 0;
        int power = digitCount;

        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) rem = 5;
            sum += (rem * (int)Math.pow(10, digitCount - power));
            power--;
            num /= 10;
        }

        return sum;

    }
}
