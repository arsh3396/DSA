package may23;


import java.util.*;

public class Function {

    // prints the table of number n
    static void tableOfNum(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }

    // returns the area
    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

//    celcius to fehrenhite conversion
    static double celciusToFehrenhite(double celcius) {
        return celcius * 9 / 5 + 32;
    }

//    checking the character is vowel or not
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

//    checking the string contains the vowels or not
    static boolean stringContainsVowel(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

//    checking the number is prime or not
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        function is block of code which performs a perticuler task
//        benefits:
//        - reusability
//        - modularity : breaking the big problem in small parts

//        static variable and methods are stored in stack memory
//        heap memory stores actual objects.

        /*
        where is non static variable is stored?

         */

//        // used this keyword
//        Checking ch = new Checking(1, 2, 3);
//        ch.add();
//
////        table of 10
//        tableOfNum(sc.nextInt());
//
////        area of circle
//        System.out.println("Area of Circle is:" + areaOfCircle(sc.nextFloat()));
//
//        System.out.println(celciusToFehrenhite(sc.nextDouble()));
//
//        System.out.println(isVowel('O'));
//
//        System.out.println(isPrime(51));

//        System.out.println(stringContainsVowel(sc.next()));

//        accessing the function of the another file
        Staircase s = new Staircase();
        s.Hello();

        sc.close();

    }
}

class Checking {
    int a, b, c;
    Checking(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void add() {
        System.out.println(a+b+c);
    }
}