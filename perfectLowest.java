public class perfectLowest {
    public static void main(String[] args) {
        int lowest = 0;

        for (int n = 1; n <= 200; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                lowest = n;
                break; 
            }
        }

        System.out.println("Lowest perfect number between 1 and 200: " + lowest);
    }
}


