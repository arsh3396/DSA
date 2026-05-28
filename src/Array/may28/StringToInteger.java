package Array.may28;

import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(myAtoi("-91283472332"));

        sc.close();
    }

    public static int myAtoi(String s) {
        if (s.length() == 0) return -1;

//        removed the leading space
        s = s.replaceAll("^[ ]+", "");

        StringBuilder sb = new StringBuilder();
        int i = 0;

//        checking if the given string is negative or not
        boolean negative = false;
        if (s.charAt(i) == '-') {
            negative = true;
            i++;
        }

//        removed the leading zeros
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
            else {
                break;
            }
            i++;
        }

        if (sb.length() == 0) {
            return 0;
        }

        String ans = sb.toString();
        int result = Integer.parseInt(ans);
        if (Long.parseLong(ans) < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        else if (Long.parseLong(ans) > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (negative) return -1 * result;
        return result;
    }
}
