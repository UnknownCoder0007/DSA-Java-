/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
   an eraser. You have to output the total cost of the items back to the user as their bill.
   (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

package Lecture_2;
import java.util.*;

public class Question_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser : ");
        float eraser = sc.nextFloat();
        float bill = pencil + pen + eraser;
        float gst = 0.18f * bill;
        float total = bill + gst;
        System.out.println("Your bill excluding GST = " + bill);
        System.out.println("Your bill including GST = " + total);
    }
}
