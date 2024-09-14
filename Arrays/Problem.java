package Arrays;
import java.util.*;
public class Problem {

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String A=sr.next();
        String B=sr.next();
        String C = A+B;
        System.out.println(C.length());
       if(A.compareTo(B)>0){
        System.out.println("Yes");
       }else{
        System.out.println("No");
       }
       String A1=A.substring(0,1).toUpperCase()+A.substring(1);
       String B1=B.substring(0,1).toUpperCase()+B.substring(1);
       System.out.println(A1+  " "+B1);
       
    }
}