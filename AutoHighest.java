public class AutoHighest {
    public static void main(String[] args) {
        int start = 1;
        int end = 200;
        int highest = -1; 

        for (int n = start; n <= end; n++) {
            int square = n * n;
            int digits = String.valueOf(n).length();
            int mod = 1;
            for (int i = 0; i < digits; i++) {
                mod *= 10;
            }
            if (square % mod == n) {
                highest = n;
            }
        }

        if (highest != -1) {
            System.out.println("Highest Automorphic number in range " + start + " to " + end + " is: " + highest);
        } else {
            System.out.println("No Automorphic numbers found in range.");
        }
    }
}


