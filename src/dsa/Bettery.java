package dsa;

import java.util.Scanner;

public class Bettery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(minuteTaken(10));

        System.out.println(factorial(sc.nextInt()));

        if (isPrime(sc.nextInt())) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a prime");
        }

        System.out.println(reverseInt(sc.nextInt()));

        System.out.println(palindrome(sc.nextInt()));

        int n1 = sc.nextInt(), n2 = sc.nextInt();
        System.out.println(gcd(Math.max(n1, n2), Math.min(n1, n2)));
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    static int reverseInt(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + (n % 10);
            n /= 10;
        }
        return num;
    }

    static int minuteTaken(int bettery) {
        int minute = 0;
        while (bettery < 100) {
            bettery += 10;
            minute++;
        }
        return minute;
    }

    static long factorial(int n) {
        long facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    static boolean palindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == n;
    }

    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1%n2);
    }
}
