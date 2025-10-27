
abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Main17 {
    public static void main(String[] args) {
      
        Dog d = new Dog();
        d.makeSound();  
        d.eat();        
    }
}


