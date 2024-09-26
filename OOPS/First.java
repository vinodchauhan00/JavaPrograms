package OOPS;

public class First {
    public static void main(String[] args) {
        Student s1=new Student("Vinod", 20);
        // System.out.println(s1.name);
        BankAccount BA=new BankAccount();
        BA.username="Vinod23";
        BA.Setpassword("Vinod@123");
        System.out.println(BA.username);

        
    }
    
}
class BankAccount{
    public String username;
     private String Password;
     public void Setpassword(String Pwd){
        Password=Pwd;
        
     }
}
class Student{
     static String College="GLA";//static variable
    String name; //instance variable
    int age;
    Student (String nm,int ag)
    {
       name=nm;
       age=ag;
    }
}

