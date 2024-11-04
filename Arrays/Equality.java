import java.util.Arrays;
public class Equality{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 7};
        System.out.println("Arr1 and Arr2  are equal: "+ArraysEqual(arr1,arr2));
        System.out.println("Arr1 and Arr3  are equal: "+ArraysEqual(arr1,arr3));
    }
    public static boolean ArraysEqual(int []arr1,int []arr2){
        return Arrays.equals(arr1, arr2);
    }
}