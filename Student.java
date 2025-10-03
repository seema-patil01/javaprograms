public class Student {
    
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Seema", 22);

        
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}


