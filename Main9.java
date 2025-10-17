  
class Engine {
    void start() {
        System.out.println("Engine starts...");
    }
}


class Car {
    private Engine engine; 

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}

public class Main9{
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}


