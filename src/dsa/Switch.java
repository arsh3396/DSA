package dsa;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        if (true != false){
//            System.out.println("Hellow");
//        }
        int n = sc.nextInt();
        for (int i = 1; i <= n/i; i++) {
            if (i * i == n){
                System.out.println(i);
                break;
            }

        }
        System.out.println(Math.sqrt(n));
        System.out.println(sum(123456789));
    }

    static int sum(int n) {
        int total = 0;
        while (n > 0) {
            total += (n % 10);
            n /= 10;
        }
        return total;
    }
}