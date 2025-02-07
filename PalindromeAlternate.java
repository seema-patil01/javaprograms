public class PalindromeAlternate {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int count = 0; // To track alternative palindrome printing

        for (int i = start; i <= end; i++) {
            int num = i;
            int reversed = 0;

            // Reverse the number
            while (num > 0) {
                int r = num % 10;
                reversed = (reversed * 10) + r;
                num /= 10;
            }

            // Check if the number is a palindrome
            if (reversed == i) {
                if (count % 2 == 0) { // Print only alternate palindromes
                    System.out.println(i);
                }
                count++; // Increment count only if a palindrome is found
            }
        }
    }
}
