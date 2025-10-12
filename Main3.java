
interface Vehicle {
    void start();
}
interface Fuel {
    void refuel();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}
class ElectricCar extends Car implements Fuel {
    public void refuel() {
        System.out.println("ElectricCar charges battery");
    }

    void display() {
        System.out.println("This is an Electric Car");
    }
}


public class Main3 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();   
        ec.refuel();  
        ec.display(); 
    }
}


