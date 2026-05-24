
package may23;
import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }

        System.out.println(num == sum);
        

        sc.close();
    }

    static int factorial (int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }
}
