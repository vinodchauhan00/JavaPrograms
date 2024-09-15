// ---largest number and small values
package Arrays;
import java.util.*;

public class Array_larg_small {

    public static int largestnumber(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (small > number[i]) {
                small = number[i];
            }
        }
        System.out.println("Small value is:" + small);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 4, 7, 13, 45, 34, 10 };
        System.out.print("largest number:");
        System.out.println(largestnumber(number));
    }
}
