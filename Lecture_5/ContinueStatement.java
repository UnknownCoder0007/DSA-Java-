package Lecture_5;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;  // to skip this iteration
            }
            System.out.println(i);
        }
    }
}
