public class test1 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        b=++a + ++b + a++ + b++ + a++;
        System.out.println(a);
        System.out.println(b);
    }
}
