public class palindromehighst {
    public static void main(String[] args) {
        
    
    int start=10;
    int end=100;
    int count=0;
    for(int i=end;i>=start;i--){
      int temp=i;
        int sum=0;
        while (temp>0) {
            int r=temp%10;
       sum=(sum*10)+r;
        temp/=10;
    
    if(sum==temp){

count++;
if(count==1){
System.out.println(i);
}
}   
}
}
    }
}
