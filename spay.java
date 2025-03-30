 class spay {
  public static void main(String[] args) {
    int n=1412;
    int prod=1;
    int sum=0;
    while(n>0){
    int r=n%10;
    prod=prod*r;
    sum=sum+r;
    n/=10;
    }
    if(prod==sum){
        System.out.println("it spay number");
    }
    else{
        System.out.println("its not spy number");
    }

  }  
}
