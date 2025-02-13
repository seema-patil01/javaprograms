public class smallest {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=2;
        if(a<b && a<c){
            System.out.println(a+"smallest number");
        }
        else if(b<c){
            System.out.println(b+"smallest number");
        }
        else{
            System.out.println(c+"smallest number");
        }
    }
}
