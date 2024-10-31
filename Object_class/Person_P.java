package Object_class;
public class Person_P {
    public static void main(String[] args) {
        Person p1=new Person("Vinod", 20);
        p1.display();

    }
    
}
class Person{
    String Name;
    int Age;

    Person(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    void display(){
        System.out.println("Name: "+Name+ "|"+ " Age: "+Age);
    }
}
