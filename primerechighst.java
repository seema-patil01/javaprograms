public class primerechighst {
    public static void main(String[] args) {
        int lower = 5, upper = 17;
        System.out.println("Last three prime numbers in range " + lower + " to " + upper + " : ");
        FindLastThreePrime(upper, lower, 0);
    }

    public static void FindLastThreePrime(int num, int lower, int count) {
        if (count == 3 || num < lower) {
            return;
        }
        if (isPrime(num)) {
            System.out.println(num);
            count++;
        }
        FindLastThreePrime(num - 1, lower, count);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        return isPrimeHelper(num, 2);
    }

    public static boolean isPrimeHelper(int num, int divisor) {
        if (divisor > num / 2) return true;
        if (num % divisor == 0) return false;
        return isPrimeHelper(num, divisor + 1);
    } 
}
