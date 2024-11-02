package Object_class;

public class Employee {
    public static void main(String[] args) {
        Employe E1 = new Employe("Vinod", "CS", 150000);
        Employe E2 = new Employe("Rahul", "IT", 120000);

        E1.display();
        
        E1.updateSalary(100003.7);
        
        E1.display();
    }
}

class Employe {
    String name;
    String title;
    double salary;

    // Constructor
    Employe(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    // Method 
    void display() {
        System.out.println("Name: " + this.name + " | Title: " + this.title + " | Salary: " + this.salary);
    }

    // Method to update the salary 
    void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary update was successful!");
    }
}
