import java.util.Scanner;

public class primefirst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range:");
        int start = s.nextInt();
        int end = s.nextInt();
        int count = 0;

        for (int i =start; i <= end; i++) {
            if (i <= 1) {
                continue; 
            }

            boolean flag = true; 

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break; 
                }
            }

            if (flag) {
                System.out.println(i);
                count++;
                if (count >= 2) {
                    break; 
                }
            }
        }
    }
}

