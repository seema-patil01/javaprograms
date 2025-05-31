import java.util.Scanner;
public class Coprime {
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (gcd(num1, num2) == 1) {
            System.out.println(num1 + " and " + num2 + " are Co-Prime numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Co-Prime numbers.");
        }

        sc.close();
    }
}
