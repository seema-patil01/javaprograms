public class PerfectRecursion {
    static int sumOfDiv(int num, int divisor) {
        if (divisor == 1)  
            return 1;
        
        if (num % divisor == 0)  
            return divisor + sumOfDiv(num, divisor - 1);
        
        return sumOfDiv(num, divisor - 1);  
    }

    static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }
        return sumOfDiv(num, num / 2) == num;  
    }

    public static void main(String[] args) {
        int num = 28;
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
