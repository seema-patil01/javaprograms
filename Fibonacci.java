public class Fibonacci {
    public static void main(String[] args) {
        int a=0; 
        int b=1;
        int c=0;
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
