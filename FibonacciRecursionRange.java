public class FibonacciRecursionRange {
    
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    
    static void printfibonacciRange(int start, int end, int index) {
        int fibNum = fibonacci(index);

        if (fibNum > end) { 
            return;
        }

        if (fibNum >= start) {
            System.out.println(fibNum);
        }

        
        printfibonacciRange(start, end, index + 1);
    }

    public static void main(String[] args) {
        int start = 5;
        int end = 50;
        System.out.println("Fibonacci numbers between " + start + " and " + end + ":");
        
        
        printfibonacciRange(start, end, 0);
    }
}
