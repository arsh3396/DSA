package may26;

import java.util.*;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(hexaDecimalConversion(451));
        sc.close();
    }

    static String hexaDecimalConversion(int num) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int rem = num % 16;
            sb.insert(0, hexa[rem]);
            num /= 16;
        }

        return sb.toString();
    }
}
