package may26;

import java.util.*;

public class Base7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(convertToBase7(100));
        sc.close();
    }

    static public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String s = "";
        boolean neg = false;
        if (num < 0) neg = true;
        num = Math.abs(num);
        while (num > 0) {
            int rem = num % 7;
            s = String.valueOf(rem) + s;
            num /= 7;
        }
        if (neg) {
            s = "-" + s;
        }
        return s;
    }
}
