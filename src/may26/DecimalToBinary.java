package may26;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(binaryConversion(40));
        System.out.println(binaryConversionInteger(40));
        sc.close();
    }
//
//    if want to return as a string
    static String binaryConversion(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0, num % 2);
            num /= 2;
        }

        return sb.toString();
    }

//    if want to return as int
    static int binaryConversionInteger(int num) {
        int total = 0, power = 1;
        while (num > 0) {
            total += (num % 2) * power;
            power *= 10;
            num /= 2;
        }
        return total;
    }

}
