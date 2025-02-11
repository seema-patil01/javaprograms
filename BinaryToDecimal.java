import java.util.Scanner;


public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = s.next();  
        s.close();
        
        int sum = 0;
        int i = 1;

     
        for (int j = bin.length() - 1; j >= 0; j--) {
            char bit = bin.charAt(j);
            if (bit != '0' && bit != '1') {
                System.out.println("Invalid binary number.");
                return;
            }
            sum += (bit - '0') * i;
            i *= 2;
        }

        System.out.println("Decimal Equivalent: " + sum);
    }
}

