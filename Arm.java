import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        
        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }

        
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

       
    }
}
