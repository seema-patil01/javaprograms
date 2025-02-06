public class PalindromeRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;

        for (int i = start; i <= end; i++) {
            int num = i; 
            int sum = 0;

            while (num > 0) {
                int r = num % 10;  
                sum = (sum * 10) + r;
                num /= 10; 
            }

            if (sum == i) { 
                System.out.println(i);
            }
        }
    }
}
