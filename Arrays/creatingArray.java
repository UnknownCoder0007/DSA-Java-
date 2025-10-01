package Arrays;

public class creatingArray {
    public static void main (String args[]) {
        int marks[] = new int[50];
        marks[0] = 95;
        marks[1] = 96;
        marks[2] = 99;
        System.out.println("1. " + marks[0]);
        System.out.println("2. " + marks[1]);
        System.out.println("3. " + marks[2]);
        marks[2] = 100;
        System.out.println("3. " + marks[2]);

        System.out.println("Length of array = " + marks.length);
    }
}
