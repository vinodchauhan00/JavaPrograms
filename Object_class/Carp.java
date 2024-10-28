package Object_class;
public class Carp {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        Car c2 = new Car("Hyundai", "Venue", 2024);
        c2.display(); }
}
class Car {
    String brand;
    String model;
    int YOM;
    Car() {
        this.brand = "Maruti";
        this.model = "Alto";
        this.YOM = 2011;
    }
    Car(String brand, String model, int YOM) {
        this.brand = brand;
        this.model = model;
        this.YOM = YOM;
    }
    void display() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.YOM);
    }
}
