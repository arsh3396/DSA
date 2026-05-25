package may25;

import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(evenSum(2, 10, 0));

        sc.close();
    }

    static int evenSum(int start, int end, int sum) {
        if (start > end) {
            return sum;
        }
        if (start % 2 == 0) sum += start;
        return evenSum(start+1, end, sum);
    }
}
