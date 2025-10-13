
    class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}


