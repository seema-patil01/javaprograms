
    class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog is running");
    }
}

public class Main10 {
    public static void main(String[] args) {
        
        Animal a = new Dog();

        a.sound();  
    }
}

