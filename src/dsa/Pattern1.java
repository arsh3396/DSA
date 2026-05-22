package dsa;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.valueOf(i)+String.valueOf(j) + " ");
            }
            System.out.println();
        }

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int start = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = start;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0)? 1 : 0;
            }
            start = (start == 0)? 1 : 0;
            System.out.println();
        }

        System.out.println(divisonOfTwoNumber(5, 2));

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n-i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                if ()
            }
        }

        int n = sc.nextInt();
        int c1 = 0, c2 = 0;

        for (int i = 1; i <= n; i++) {
            for (int l = 0; l < 2; l++) {
                for (int j = 1; j <= 2*i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//        hollow pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if (k == 1 || k == i || i == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}
