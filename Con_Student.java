public class Con_Student {
  // constructor
    String name;
    int age;
    Con_Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {

        Con_Student s1 = new Con_Student("Seema", 22);
       Con_Student s2 = new Con_Student("Rahul", 20);

        s1.display();
        s2.display();
    }
}


