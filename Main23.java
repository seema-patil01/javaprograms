interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
}

class Person {
    private Vehicle v;
    public Person(Vehicle v) {
        this.v = v;
    }

    void drive() {
        v.start();
    }
}

public class Main23 {
    public static void main(String[] args) {
        Vehicle bike = new Bike();     
        Person p = new Person(bike);
        p.drive();
    }
}
