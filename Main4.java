
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats");
    }

    void display() {
        super.eat(); 
        eat();       
    }
}
public class Main4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}


