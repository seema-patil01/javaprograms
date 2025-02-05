public class palin {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        int c = n; 

        while (n > 0) { 
            int r = n % 10; 
            sum = (sum * 10) + r; 
            n /= 10; 
        }

        if (sum == c) { 
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
