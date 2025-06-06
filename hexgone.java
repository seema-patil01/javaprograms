import java.util.Scanner;

public class hexgone {
    public static int hexagonalNumber(int n) {
        return 2 * n * n - n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many hexagonal numbers to print: ");
        int count = scanner.nextInt();

        System.out.println("First " + count + " hexagonal numbers:");
        for (int i = 1; i <= count; i++) {
            System.out.print(hexagonalNumber(i) + " ");
        }

        scanner.close();
    }
}
