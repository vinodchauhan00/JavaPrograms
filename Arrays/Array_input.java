package Arrays;
import java.util.*;
public class Array_input {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter arr size:");
        int n=sr.nextInt();
        int  [] num= new int [n];
        System.out.println("enter " + "Element:");
        for(int i=0;i<num.length;i++){
            num [i] = sr.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(num[i] + " ");
        // }
        for(int arr:num){
            System.out.println(arr + " ");
        }
    }
    
}