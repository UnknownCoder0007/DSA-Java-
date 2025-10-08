package Lecture_2;
import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence);
        String word = sc.next();
        System.out.println(word);

        short s = sc.nextShort();
        System.out.println(s);
        int n = sc.nextInt();
        System.out.println(n);
        long l = sc.nextLong();
        System.out.println(l);

        float f = sc.nextFloat();
        System.out.println(f);
        double d = sc.nextDouble();
        System.out.println(d);

        boolean flag = sc.nextBoolean();
        System.out.println(flag);
    }
}
