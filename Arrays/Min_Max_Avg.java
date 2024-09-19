package Arrays;
import java.util.Scanner;

public class Min_Max_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter "+ n +"Element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Max value is: "+max);
        System.out.println("Max value is: "+min);
        System.out.println("Max value is: "+avg);




    }
    
}
