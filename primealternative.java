import java.util.Scanner;

class primealternative {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a rage");
    int a=s.nextInt();
    int b=s.nextInt();
    int count=0;
    for(int i=a;i<=b;i++){

    
    if(i<=1)continue;
    boolean flage=true;

    for(int j=2;j<=i/2;j++){
        if(i%j==0){
            flage=false;

        }
    }
    if (flage) {
        count++;
        if(count%2!=0){
            System.out.println(i);
        }
    }
   } 
}
}
