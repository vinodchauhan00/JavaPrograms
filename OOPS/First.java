package OOPS;

public class First {
    public static void main(String[] args) {
        Student s1 = new Student("Vinod", 20);
        // Uncomment the line below if you want to print the student's name
        // System.out.println(s1.name);
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.username = "Vinod23";
        bankAccount.setPassword("Vinod@123");
        System.out.println(bankAccount.username);
    }
}

class BankAccount {
    public String username;
    private String password; // Renamed to follow standard camelCase
    
    // Method name changed to follow standard Java naming conventions
    public void setPassword(String pwd) {
        this.password = pwd;
    }
}

class Student {
    static String college = "GLA"; // Renamed to follow standard camelCase
    String name; // Instance variable
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
