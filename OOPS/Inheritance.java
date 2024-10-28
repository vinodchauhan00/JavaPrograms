package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Animal A1=new Animal();
        // A1.eat();
        Fish f1=new Fish();
        f1.eat();
    }
    
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}
//Derived class and subclass
class Fish extends Animal{
    int Fish;
    void swim(){
        System.out.println("Swims");
    }
}
