package may25;

import java.util.*;

public class StringConcatanation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greeting("Harsh");


        sc.close();
    }

    static void greeting(String name) {
        System.out.println("Hello " + name);
    }
}
