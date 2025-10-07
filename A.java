    
class Person {
    void speak() {
        System.out.println("Person can speak");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee works in a company");
    }
}


class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages the team");
    }
}


public class A {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.speak();  
        m.work();   
        m.manage(); 
    }
}

