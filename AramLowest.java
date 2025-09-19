public class AramLowest {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int lowest = -1; 

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
                lowest = n;
                break; 
            }
        }

        if (lowest != -1) {
            System.out.println("Lowest Armstrong number in range " + start + " to " + end + " is: " + lowest);
        } else {
            System.out.println("No Armstrong numbers found in range.");
        }
    }
}


