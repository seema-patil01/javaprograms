class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Seema");
            Student s2 = (Student) s1.clone();

            System.out.println("Original: " + s1.id + " " + s1.name);
            System.out.println("Cloned:   " + s2.id + " " + s2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
