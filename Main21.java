
   
class Student {

    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) { 
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}


public class Main21 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Seema");
        s.setAge(21);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}


