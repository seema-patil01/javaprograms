public class fFibonacciAltr {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int count=0;
        while (count<n) {
            if (count%2==0) {
              System.out.println(a);  
            }
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
}
