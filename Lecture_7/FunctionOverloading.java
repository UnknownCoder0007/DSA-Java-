package Lecture_7;

public class FunctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(2,5));
        System.out.println(sum(2,3,4));
        System.out.println(sum(3.14f, 2.7f));
    }
}
