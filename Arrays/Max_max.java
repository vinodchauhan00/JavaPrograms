package Arrays;
import java.util.Scanner;

public class Max_max {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           int arr[]=new int [5];
           System.out.println("Enter element:");
           for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           }
           int min =arr[0];
           int max =arr[0];
           for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                min=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

           }
           int sum=0;
           for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            double avg=sum/arr.length;
           }
           System.out.println("Max element is: "+max+ " min element is:"+min);
           System.out.println("Sum of element is: "+sum);
           

            
        }
    
}
