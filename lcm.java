public class lcm {
    static int gcd(int a, int b){
        if(b==0){
            return a;
    }          
       return gcd(b,a%b) ;
    }
        static int lcm(int a,int b){
            return(a*b)/gcd(a,b); 
        
        }
       public static void main(String[] args){
        int num1=24,num2=36;
        int result=lcm(num1,num2);
        System.out.println(result);
       } 
    }
    

