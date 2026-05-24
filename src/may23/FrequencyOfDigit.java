package may23;

import java.util.*;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int freq = digiFrequency(5555555, 5);
        System.out.println(freq);
        sc.close();
    }

    static int digiFrequency(int num, int digit) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
