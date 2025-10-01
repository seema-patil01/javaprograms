public class Block {
    static{
        System.out.println("static block-1");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main ends");
    }
    static{
        System.out.println("static block-2");
    }
}
