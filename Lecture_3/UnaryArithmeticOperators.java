package Lecture_3;

public class UnaryArithmeticOperators {
    public static void main(String args[]) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int p = 10;
        int q = --p;
        System.out.println(p);
        System.out.println(q);

        int x = 10;
        int y = x--;
        System.out.println(x);
        System.out.println(y);
    }
}
