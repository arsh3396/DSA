package may25;

import java.util.*;

public class ReturnUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        useOfReturn(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    static void useOfReturn(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First line");
        System.out.println("Second line");
        if (a == 2) {
            return;
        }
        System.out.println("Sum of a and b is " + (a+b));
        useOfReturn(sc.nextInt(), sc.nextInt());
    }
}
