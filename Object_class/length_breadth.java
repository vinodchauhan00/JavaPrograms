package Object_class;
import java.util.*;

public class length_breadth {
    public static void main(String[] args) {
        Rectangle R1=new Rectangle();
        R1.display();

    }
    
}

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length:");
        this.length=sc.nextInt();
        System.out.println("Enter Breadth:");
        this.breadth=sc.nextInt();
}

 void display(){
    System.out.println("Length:"+this.length+"Breadth:"+this.breadth);
    System.out.println("Area:"+(this.length*this.breadth));

}

 }