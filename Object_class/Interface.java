package Object_class;

public class Interface {
  public static void main(String[] args) {
      Honda obj = new Honda();
      obj.run();
      obj.normal();
  }
}


interface Bike {
    default void normal() {
        System.out.println("normal method");
    }

    void run();
}

class Honda implements Bike {
    public void run() {
        System.out.println("abstract method implemented");
    }
}

 
