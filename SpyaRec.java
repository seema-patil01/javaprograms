import java.util.Scanner;

public class SpyRec {
    
    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }

    static int prodOfDigits(int num) {
        if (num < 10) { 
            return num;
        }
        return (num % 10) * prodOfDigits(num / 10);
    }

    static boolean isSpyNumber(int num) {
        return sumOfDigits(num) == prodOfDigits(num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");  
        int number = s.nextInt();
        s.close();
        
        if (isSpyNumber(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
    }
}
