package Object_class;

public class Get_Set {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(25);

        System.out.println("Name: " + p1.getName()); 
        System.out.println("Age: " + p1.getAge());     
    }
}

class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
