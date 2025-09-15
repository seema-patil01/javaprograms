public class test {
  
  
    int id;
    String name;

    test(int id, String name) {
        this.id = id;      
        this.name = name;   
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        test s1 = new test(101, "Alice");
        test s2 = new test(102, "Bob");

        s1.display();
        s2.display();
    }
}

   
    

