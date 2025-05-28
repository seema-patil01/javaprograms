
    import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}


