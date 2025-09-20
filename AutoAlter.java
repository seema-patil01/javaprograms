public class AutoAlter {
  
    public static void main(String[] args) {
        int start = 1;
        int end = 200;
        int count = 0; 

        System.out.println("Alternate Automorphic numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {
            int square = n * n;
            int digits = String.valueOf(n).length();
            int mod = 1;
            for (int i = 0; i < digits; i++) {
                mod *= 10;
            }
            if (square % mod == n) {
                count++;
                if (count % 2 != 0) { 
                    System.out.println(n);
                }
            }
        }
    }
}


