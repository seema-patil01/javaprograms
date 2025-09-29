public class Student {
   
    String name;
    int age;

    // constructor using 'this' keyword example
    Student(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Seema", 22);
        s1.display();
    }
}


