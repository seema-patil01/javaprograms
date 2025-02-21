import java.util.Scanner;

class sum {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    int n=s.nextInt();
    int sum=0;
  while (n>0) {
    sum+=n%10;
      n/=10;
  }
        
  System.out.println("sum="+sum);
  }  
}
