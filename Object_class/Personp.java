package Object_class;

public class Personp {
    public static void main(String[] args) {
        Person p1 = new Person(20, "Vinod", "Kosi");
        p1.display();
        Person p2 = new Person();
        p2.display();
    } 
}

class Person {
    int Age;
    String Name;
    String Address;

    // Default constructor
    Person() {
        this.Age = 18;        
        this.Name = "Unknown"; 
        this.Address = "Unknown"; 
    }

    // Parameterized constructor
    Person(int Age, String Name, String Address) {
        this.Age = Age;
        this.Name = Name;
        this.Address = Address;
    }

    void display() {
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Address: " + this.Address);
    }
}
