package dsa;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Function f = new Function();
        System.out.println(f.add(1, 2));
    }

    int add(int n1, int n2) {
        return n1 + n2;
    }

}