
    class Student {
    String name;
    int age;
    String course;

  
    Student() {
        this("Unknown", 18);
        System.out.println("Default constructor called");
    }

   
    Student(String name, int age) {
        this(name, age, "BCA"); 
        System.out.println("Constructor with 2 parameters called");
    }

   
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 parameters called");
    }

    void display() {
        System.out.println(name + " - " + age + " - " + course);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Student s = new Student(); 
        s.display();
    }
}


