package may26;

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(decimalConversionFromBinary("10101"));
        System.out.println(decimalConversion(10101));
        sc.close();
    }

    // if given as string
    static int decimalConversionFromBinary(String s) {
        int num = 0;
        int i = s.length() - 1, power = 1;
        while (i >= 0) {
            num += (s.charAt(i) - '0') * power;
            power *= 2;
            i--;
        }
        return num;
    }

    // if given as a number
    static int decimalConversion(int num) {
        int result = 0, power = 1;
        while (num > 0) {
            result += (num % 10) * power;
            power *= 2;
            num /= 10;
        }
        return result;
    }
}
