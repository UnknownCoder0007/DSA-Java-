package Arrays;

public class linearSearch {
    public static int linearSearch (String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (key == menu[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main (String args[]) {
        String menu[] = {"samosa", "chole bhature", "pizza", "burger"};
        String key = "pizza";
        int index = linearSearch (menu, key);
        if (index == -1) {
            System.out.println ("Not Found");
        }
        else {
            System.out.println ("Item found at index " + index);
        }
    }    
}
