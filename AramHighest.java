public class AramHighest {
     public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int highest = -1; 

        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int r = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= r;
                }

                sum += power;
                temp /= 10;
            }

            if (n == sum) { 
                highest = n; 
            }
        }

        if (highest != -1) {
            System.out.println("Highest Armstrong number in range " + start + " to " + end + " is: " + highest);
        } else {
            System.out.println("No Armstrong numbers found in range.");
        }
    }
}


