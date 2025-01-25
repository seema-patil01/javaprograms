public class Primerecurs {
    public static boolean isprime(int number,int divsor){
        if(number<=1){
            return false;
        }
        if(divsor==1){
            return true;
        }
        if(number%divsor==0){
            return false;
        }
        return(isprime(number, divsor-1));
    }
    public static void main(String[] args) {
        int number=15;
        if(isprime(number,number/2)){
            System.out.println(number+ "is prime number");

        }
        else{
            System.out.println(number+ "is not prim number");
        }
    }
    
}
