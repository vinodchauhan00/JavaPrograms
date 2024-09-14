//2Darrays in java

package Arrays;

public class Darray {
    public static void main(String[] args) {
        int a[]={1,2,4};
        int b[]={1,2,4};
        int c[]={1,2,4};

        int arr[][]={a,b,c};
        // for(int i=0;i<arr.length;i++){
        //     for(int k:arr[i]){
        //         System.out.print(k+" ");
        //     }

        // Using enhanced for loop to iterate over the array

        for(int k[]:arr){
            for(int l:k){
                System.out.print(l+" ");
        }
            System.out.println();
        }
    }
    
}
