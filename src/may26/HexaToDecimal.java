package may26;

import java.util.*;

public class HexaToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(decimalConversionFromHexa("1C3"));
        sc.close();
    }

    static int decimalConversionFromHexa (String s) {

        int i = s.length() - 1, result = 0, power = 1, rem = 0;

        while (i >= 0) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                rem = ch - '0';
            }
            else {
                rem = (ch - 'A') + 10;
            }
            result += (rem * power);
            power *= 16;
            i--;
        }

        return result;
    }
}
