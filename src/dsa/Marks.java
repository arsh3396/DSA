package dsa;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error");
                break;
        }

        String roll = sc.next();
        switch (roll){
            case "admin":
                System.out.println("admin");
                break;
            case "student":
                System.out.println("student");
                break;
            case "teacher":
                System.out.println("teacher");
                break;
            case "guest":
                System.out.println("guest");
                break;
            default:
                System.out.println("error");
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int n = 20;
        System.out.println((n * (n + 1)) / 2);
    }
}
