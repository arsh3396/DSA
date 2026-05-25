package may25;

import java.util.*;

public class CheckSecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(secondLastDigitCheck(1234567));
        System.out.println(secondLastCheck(123456));
        System.out.println(checkIfDigitIsEven(123456, 7));

        sc.close();
    }

//    using string
    static boolean secondLastDigitCheck(int n) {
        String s = String.valueOf(n);

        if (s.length() < 2) return false;
        int l = s.length();
        char ch = s.charAt(l-2);
        if ((ch - '0') % 2 == 0) {
            return true;
        }
        return false;
    }

//    without making string chcking if second last digit is even or not
    static boolean secondLastCheck(int n) {
        int count = 0, secondLast = 0;
        while(n > 0) {
            int rem = n % 10;
            if (count == 1) {
                secondLast = rem;
            }
            count++;
            n/= 10;
        }

        if (count < 1) {
            return false;
        }
        else {
            if (secondLast % 2 == 0) return true;
            return false;
        }
    }

//    checking if any index from the last is even or not
    static boolean checkIfDigitIsEven(int n, int position) {
        int count = 0, index = 0;
        while(n > 0) {
            int rem = n % 10;
            if (count == position - 1) {
                index = rem;
            }
            count++;
            if (count == 2) break;
            n/= 10;
        }

        if (count < position-1) {
            return false;
        }
        else {
            if (index % 2 == 0) return true;
            return false;
        }
    }
}
