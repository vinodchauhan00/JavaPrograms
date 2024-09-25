package OOPS;

public class Second {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setprice(5);
        System.out.println(p1.price);

    }
    
}
class Pen{
    String color;
    int price;
    void setcolor(String newColor){
        color=newColor;
    }
    void setprice(int newPrice){
        price=newPrice;

    }
}
