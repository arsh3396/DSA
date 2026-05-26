package may26;

import java.util.*;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(decimalConversionFromOctal("145"));
        System.out.println(decimalConversion(145));
        sc.close();
    }

    // if given as a string
    static int decimalConversionFromOctal(String s) {
        int i = s.length() - 1, num = 0, power = 1;
        while (i >= 0) {
            num += (s.charAt(i) - '0') * power;
            i--;
            power *= 8;
        }
        return num;
    }

    // if given as a number
    static int decimalConversion(int num) {
        int result = 0, power = 1;
        while (num > 0) {
            result += (num % 10) * power;
            power *= 8;
            num /= 10;
        }
        return result;
    }
}
