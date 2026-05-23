package may23;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int l = 0; l < 2; l++) {
                for (int j = 1; j <= 2*i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}