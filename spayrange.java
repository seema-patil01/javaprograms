public class spayrange {
    public class SpyInRange {
    public static void main(String[] args) {
        int start = 10; 
        int end = 500;   

        System.out.println("Spy numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isSpy(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isSpy(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }

        return sum == prod;
    }
}

}
