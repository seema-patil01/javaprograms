
    class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Main15 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Seema");
        Student s2 = new Student(102, "Anita");

        System.out.println(s1);          
        System.out.println(s2.toString()); 
    }
}


