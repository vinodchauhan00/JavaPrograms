package Object_class;

public class First {
    public static void main(String[] args) {
        Student s1=new Student("Vinod", 20);
        System.out.println(s1.name);
        
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

