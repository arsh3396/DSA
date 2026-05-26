package may26;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(binaryConversion(40));
        sc.close();
    }

    static String binaryConversion(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }

        return sb.reverse().toString();
    }
}
