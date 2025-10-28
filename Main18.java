
interface Animal {
    void eat();   
    void sleep(); 
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void sleep() {
        System.out.println("Dog sleeps in kennel.");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    public void sleep() {
        System.out.println("Cat sleeps on couch.");
    }
}


public class Main18 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}


