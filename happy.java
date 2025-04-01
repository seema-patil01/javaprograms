import java.util.Scanner;
public class happy {
    public static void main(String[] args) {
        int n,r=1,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        num=n;
        while(num>9){
            while(num>0){
                r=num%10;
                sum=sum+(r*r);
                num/=10;

            }
            num=sum;
            sum=0;
        }
        if(num==1)
            System.out.println("Happy Number");
        
        else
            System.out.println("Not happy number");
        


    }
    
}
