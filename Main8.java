
    class Parent {
    static void show() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    
    static void show() {
        System.out.println("Static method in Child class");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();

        p.show();  
        c.show(); 

        Child.show(); 
    }
}


