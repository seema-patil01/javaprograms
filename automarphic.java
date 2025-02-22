import java.util.Scanner;

public class automarphic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int sq=n*n;
        boolean flag=true;
        while (n>0) {
          if(n%10!=sq%10){
            flag=false;
            break;

          } 
          n/=10;
          sq/=10;

        }
        if(flag){
            System.out.println(" it's automorphic");
        }
        else{
            System.out.println(" it's not automarphic");
        }
    }
}
