public class Armstrong {
static int countDigit(int n){
    if (n==0) {
      return 0;  
    }
    return 1+countDigit(n/10);
}
static boolean isAremstrong(int n,int orginal,int numberDigit){
    if (n==0) {
       return orginal== 0; 
    }
    int digit=n%10;
    return isAremstrong(n/10,orginal-(int)Math.pow(digit, numberDigit));
}

    public static void main(String[] args) {
     int numberDigit=countDigit(n);
     if (isAremstrong(n)) {
        
     }   
    }

   }
