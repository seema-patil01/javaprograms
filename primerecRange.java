public class primerecRange {
   public static boolean isprime(int num,int i){
    if(num<=2){
        return num==2;
    }
    if(num%i==0){
        return false;

    }
    if(i*i>num){
        return true;
    }
    return isprime(num, i+1);
   } 
   public static void printprimeinrange(int start,int end){
    if(start>end){
        return;
    }
    if(isprime(start, 2)){
        System.out.println(start+" ");
    }
    printprimeinrange(start+1, end);
   }
   public static void main(String[] args) {
    int start=10;
    int end=50;
    System.out.println("prime no"+start+"and"+end+":");
    printprimeinrange(start, end);
   }
}
