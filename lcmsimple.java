import java.util.Scanner;

public class lcmsimple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter 2 number");
        int a=s.nextInt();
        int b=s.nextInt();
        int n=a>b?a:b;
        int i=n;
        while (true) {
            if(n%10==0&&n%b==0)
            break;
            n+=i;
        }
        System.out.println("lcm of "+a+"and"+b+"is"+n);
        
    }
}
