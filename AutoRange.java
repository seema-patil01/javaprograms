public class AutoRange {
   
    public static void main(String[] args) {
        System.out.println("Automorphic numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int square = n * n;
            int temp = n;
            boolean isAutomorphic = true;

            while (temp > 0) {
                if (temp % 10 != square % 10) {
                    isAutomorphic = false;
                    break;
                }
                temp /= 10;
                square /= 10;
            }

            if (isAutomorphic) {
                System.out.print(n + " ");
            }
        }
    }
}


