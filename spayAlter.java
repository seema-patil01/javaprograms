public class spayAlter {
    class Main {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Alternate Spy numbers between 1 and 200:");

        for (int n = 1; n <= 200; n++) {
            int sum = 0, product = 1, temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product) {
                count++;
                if (count % 2 != 0) { 
                    System.out.print(n + " ");
                }
            }
        }
    }
}

}
