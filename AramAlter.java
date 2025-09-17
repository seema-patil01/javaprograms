public class AramAlter {
    
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int count = 0;
        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int r = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= r;
                }

                sum += power;
                temp /= 10;
            }
              if (n == sum) {      
                count++;
                if (count % 2 != 0) { 
                    System.out.println(n);
                }
            }
        }
    }
}


