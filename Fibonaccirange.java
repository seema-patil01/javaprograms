import java.util.Scanner;

public class Fibonaccirange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter range");
        int l=s.nextInt();
        int u=s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        while (a<=u) {
            if (a>=l) {
              System.out.println(a);  
            }
            c=a+b;
            a=b;
            b=c;
        }
    }
}
