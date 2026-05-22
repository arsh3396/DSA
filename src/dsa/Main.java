package dsa;

public class Main {
    static int a = 10;
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.shot());

        int b = 5;
        System.out.println(--b);

        b = b-- + ++b;
        System.out.println(b);

        int x = 5;
        System.out.println(x++ + ++x * x++);

        int y = 1;
        System.out.println(++y + y++ + --y + y--);

        int c = 3;
//        if (a * 2 > 5 | a / 0 > 1) {
//            System.out.println("Safe");
//        }

        int p = 10, q = 6, r = 11;
        int temp = q > r ? q : r;
        int max = (p > temp) ? p : temp;

        System.out.println(max);
        max = (q > r? q : r) > p ? (q > r? q : r) : p;
        System.out.println(max);
    }

    int shot() {
        return a + 18;
    }
}