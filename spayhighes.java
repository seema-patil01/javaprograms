public class spayhighes {
   
    public static void main(String[] args) {
        int highest = 0;

        for (int n = 1; n <= 200; n++) {
            int sum = 0, product = 1, temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product) {
                highest = n; 
            }
        }

        System.out.println("Highest Spy number between 1 and 200: " + highest);
    }
}


