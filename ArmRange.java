public class ArmRange {
 

    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            int temp = num;
            
            // Count digits
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            temp = num;
            // Calculate sum of digits raised to power count
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                // Multiply digit by itself 'count' times
                for (int j = 0; j < count; j++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}


