public class spayLowest {
   
    public static void main(String[] args) {
        int lowest = 0;

        for (int n = 1; n <= 200; n++) {
            int sum = 0, product = 1, temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product) {
                lowest = n;
                break;
            }
        }

        System.out.println("Lowest Spy number between 1 and 200: " + lowest);
    }
}


