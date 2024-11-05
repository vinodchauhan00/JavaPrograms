package Object_class;
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}
public class Overloaded  {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Adding two integers: " + math.add(5, 10));         
        System.out.println("Adding three integers: " + math.add(5, 10, 15));   
        System.out.println("Adding two doubles: " + math.add(5.5, 10.5));      
        System.out.println("Adding two strings: " + math.add("Hello, ", "World!")); 
    }
}
