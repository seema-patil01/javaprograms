
interface Animal {
    void eat();
}

interface Pet {
    void play();
}
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats bones");
    }

    public void play() {
        System.out.println("Dog loves to play");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}


