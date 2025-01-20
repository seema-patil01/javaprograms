import java.util.Scanner;

class prim {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number");
    int n=s.nextInt();
    boolean flag=true;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            flag=false;
            break;
            
        }

    }
    if(flag){
        System.out.println("it is prim number");
    }
    else{
        System.out.println("it's not prime number");
    }
  }  
}
