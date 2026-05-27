package may26;

import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(decimalConversio("1C3", 16));
        sc.close();
    }

//    convert from current base(binary, octal, hexadecimal) to decimal just from one code
    static int decimalConversio(String s, int base) {
        int result = 0, power = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            }
            else {
                digit = ch - 'A' + 10;
            }
            result += (digit * power);
            power *= base;
        }
        return result;
    }
}
