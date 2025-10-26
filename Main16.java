
    class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)  
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj; 
        return id == s.id && name.equals(s.name);
    }
}

public class Main16 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Seema");
        Student s2 = new Student(101, "Seema");
        Student s3 = new Student(102, "Riya");

        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3)); 
    }
}


