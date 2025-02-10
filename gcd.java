import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        int b=s.nextInt();
        while (b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("gcd of two number is"+a);
    }
}
