public class perfectHighest {
    
    public static void main(String[] args) {
        int highest = 0;

        for (int n = 1; n <= 200; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                highest = n;
            }
        }

        System.out.println("Highest perfect number between 1 and 200: " + highest);
    }
}


