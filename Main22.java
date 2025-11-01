class Bike {
    void start() {
        System.out.println("Bike started...");
    }
}

class Person {
    private Bike bike; 

    Person() {
        bike = new Bike(); 
    }

    void ride() {
        bike.start(); 
    }
}

public class Main22 {
    public static void main(String[] args) {
        Person p = new Person();
        p.ride();
    }
}
