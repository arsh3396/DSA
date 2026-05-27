package may26;

import java.util.*;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(baseConversionFromDecimal(451, 16));

        sc.close();
    }

    static String baseConversionFromDecimal(int num, int base) {
        String result = "";
        String hexa = "0123456789ABCDEF";
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int digit = num % base;
            sb.insert(0, hexa.charAt(digit));
            num /= base;
        }

        return sb.toString();
    }
}
