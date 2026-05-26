package may26;

import java.util.*;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = decimalConversion(705);
        System.out.println(binaryConversion(result));

        sc.close();
    }

    static int decimalConversion(int num) {
        int result = 0, power = 1;
        while (num > 0) {
            result += (num % 10) * power;
            power *= 8;
            num /= 10;
        }
        return result;
    }

    static String binaryConversion(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0, num % 2);
            num /= 2;
        }

        return sb.toString();
    }
}
