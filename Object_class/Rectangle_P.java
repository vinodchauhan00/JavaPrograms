package Object_class;
public class Rectangle_P{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,8);
        Rectangle r2=new Rectangle(4,6);
        r1.displayArea();
        r2.displayPerimeter();

    }
}

class Rectangle{
    int width;
    int height;
    Rectangle(int width,int height){
        this.height=height;
        this.width=width;

    }
    //Method  to display area of rectangle

    int Area(){
        return width*height;
    }
    int Perimeter(){
        return 2*(width+ height);
    }
    void displayArea(){
        System.out.println("Area:"+Area());
    }
    void displayPerimeter(){
        System.out.println("Perimeter:"+Perimeter());
    }
}
