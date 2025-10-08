package Lecture_2;

public class TypePromotion {
    public static void main(String args[]){
        byte b = 5;
//        b = b * 2;  //error coz of int
        b = (byte)(b * 2);
        System.out.println(b);
    }
}
