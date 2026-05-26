package may26;

import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(ocatalConversion(101));

        sc.close();
    }

    static String ocatalConversion(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, num % 8);
            num /= 8;
        }
        return sb.toString();
    }
}
