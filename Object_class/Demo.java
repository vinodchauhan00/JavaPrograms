package Object_class;

public class Demo {
    public static void main(String[] args) {
        Rectangle R1=new Rectangle(6,8);
        R1.display();
        
    }
    
}

class  Rectangle {
    int l;
    int b;
    Rectangle (int l,int b){
        this.l=l;
        this.b=b;

    }
    void display() {
        System.out.println("length:"+this.l +" Breadth:" + this.b);
        System.out.println("Area:"+(this.l * this.b));
    }
}

