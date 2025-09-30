public class Non_static {
    static{
        System.out.println("static block-1");
    }
    {
        System.out.println("non block-1");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        new Non_static();
        System.out.println("main ends");
    }
}
