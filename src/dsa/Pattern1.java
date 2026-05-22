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

        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
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

        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int start = 0;
        int n9 = sc.nextInt();
        for (int i = 1; i <= n9; i++) {
            int num = start;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0)? 1 : 0;
            }
            start = (start == 0)? 1 : 0;
            System.out.println();
        }

        int n2 = sc.nextInt();
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        int n3 = sc.nextInt();
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int n4 = sc.nextInt();
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= n4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n5 = sc.nextInt();
        for (int i = 0; i < n5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n5-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n6 = sc.nextInt();
        for (int i = 0; i < n6; i++) {
            char ch = 'A';
            for (int j = 0; j < n6-i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }



        int n7 = sc.nextInt();
        int c1 = 0, c2 = 0;

        for (int i = 1; i <= n7; i++) {
            for (int l = 0; l < 2; l++) {
                for (int j = 1; j <= 2*i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        for (int i = 1; i <= n7; i++) {
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
        for (int i = 1; i <= n7; i++) {
            for (int j = 1; j <= (n7-i); j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if (k == 1 || k == i || i == n7) {
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
