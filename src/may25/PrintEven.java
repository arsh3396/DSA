package may25;

import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        evenNumbers(10, 100);

        sc.close();
    }

    static void evenNumbers(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.print(start + " ");
        }
        evenNumbers(start+1, end);
    }
}
