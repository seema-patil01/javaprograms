
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car is a type of Vehicle");
    }
}


public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();     
        c.display(); 
    }
}


