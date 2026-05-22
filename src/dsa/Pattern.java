package dsa;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(squareOfDigit(12131));
        System.out.println(armstrong(153));
//        perfectSqurare(20, 80);
        for (int i = 20; i <= 1000; i++) {
            int root = (int)Math.cbrt(i);
            if ((int)Math.pow(root, 3) == i) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int first = 0, second = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(Math.max(n1, n2), Math.min(n1, n2)));

    }

    static int squareOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int)Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }

    static boolean armstrong(int n) {
        int count = (int)Math.log10(n) + 1;
        int temp = n, sum = 0;
        while(temp > 0) {
            sum += (int)Math.pow(temp%10, count);
            temp /= 10;
        }
        return n == sum;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }




}
