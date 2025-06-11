import java.util.Scanner;

public class TwinPrime {
 

    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        if (prime(a) && prime(b) && (Math.abs(a - b) == 2))
        {
            System.out.println("Twin Prime");
        }
        else
        {
            System.out.println("Not Twin Prime");
        }
    }
    static boolean prime(int n)
    {
       
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}

