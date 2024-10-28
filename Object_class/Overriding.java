package Object_class;
public class Overriding {
    public static void main(String[] args) {
        Parent c1=new Parent();
        c1.display();
    }   
}
class Parent{
    void display(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
  void display(){
      System.out.println("Child class");
}
}
